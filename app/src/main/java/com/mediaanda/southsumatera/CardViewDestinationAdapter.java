package com.mediaanda.southsumatera;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class CardViewDestinationAdapter extends RecyclerView.Adapter<CardViewDestinationAdapter.CardViewViewHolder> {
    private List<Destination> listDestination;
    private Context context;

    CardViewDestinationAdapter(List<Destination> listDestination){
        this.listDestination = listDestination;
    }


    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);
        CardViewViewHolder cvh = new CardViewViewHolder(view);

        return cvh;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        holder.tvName.setText(listDestination.get(position).getName());
        holder.tvDescription.setText(listDestination.get(position).getDescription());
        holder.imgPhoto.setImageResource(listDestination.get(position).getPhotoId());

    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void setListDestination(ArrayList<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    @Override
    public int getItemCount() {
        return listDestination.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        ImageView imgPhoto;
        TextView tvName, tvDescription;
        Button btnDetail, btnShare;

        CardViewViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv_destination);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvDescription = (TextView)itemView.findViewById(R.id.tv_item_description);
            btnDetail = (Button)itemView.findViewById(R.id.btn_Detail);
            btnShare = (Button)itemView.findViewById(R.id.btn_share);
        }
    }



}
