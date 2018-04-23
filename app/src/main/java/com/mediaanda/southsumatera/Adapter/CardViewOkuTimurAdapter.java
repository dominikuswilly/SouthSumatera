package com.mediaanda.southsumatera.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.List;

public class CardViewOkuTimurAdapter extends RecyclerView.Adapter<CardViewOkuTimurAdapter.CardViewViewHolder> {

    private List<Destination> listDestination;
    private Context context;

    public void setListDestination(List<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    public CardViewOkuTimurAdapter(List<Destination> listDestination) {

        this.listDestination = listDestination;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        ImageView imgPhoto;
        TextView tvName, tvDescription;
        Button btnDetail;

        CardViewViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv_destination);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvDescription = (TextView)itemView.findViewById(R.id.tv_item_description);
            btnDetail = (Button)itemView.findViewById(R.id.btn_Detail);

        }
    }
}
