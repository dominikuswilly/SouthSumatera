package com.mediaanda.southsumatera;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewDestinationAdapter extends RecyclerView.Adapter<CardViewDestinationAdapter.CardViewViewHolder> {
    private ArrayList<Destination> listDestination;
    private Context context;

    CardViewDestinationAdapter(Context context){
        this.context = context;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);

        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        Destination d = getListDestination().get(position);

        RequestOptions myOptions = new RequestOptions()
                .fitCenter()
                .override(350, 350);

        Glide.with(context)
                .load(d.getPhoto())
                .apply(myOptions)
                .into(holder.imgPhoto);

        holder.tvName.setText(d.getName());
        holder.tvDescription.setText(d.getDestination());

        //holder.btnFavorite.setOnClickListener(new CustomOn);

    }

    public ArrayList<Destination> getListDestination() {
        return listDestination;
    }

    public void setListDestination(ArrayList<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    @Override
    public int getItemCount() {
        return getListDestination().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDescription;
        Button btnFavorite, btnShare;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvDescription = (TextView)itemView.findViewById(R.id.tv_item_description);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
        }
    }
}
