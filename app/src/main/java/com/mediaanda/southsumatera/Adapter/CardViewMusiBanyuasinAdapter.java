package com.mediaanda.southsumatera.Adapter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mediaanda.southsumatera.CustomOnItemClickListener;
import com.mediaanda.southsumatera.Fragment.Destination;
import com.mediaanda.southsumatera.Fragment.KongerLakeFragment;
import com.mediaanda.southsumatera.R;
import com.mediaanda.southsumatera.Fragment.RakitHouseFragment;
import com.mediaanda.southsumatera.Fragment.SekayuWaterfrontFragment;
import com.mediaanda.southsumatera.Fragment.UlakLiaLakeFragment;

import java.util.List;

public class CardViewMusiBanyuasinAdapter extends RecyclerView.Adapter<CardViewMusiBanyuasinAdapter.CardViewViewHolder> {

    private List<Destination> listDestination;
    private Context context;

    public void setListDestination(List<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    public CardViewMusiBanyuasinAdapter(List<Destination> listDestination) {

        this.listDestination = listDestination;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);
        CardViewMusiBanyuasinAdapter.CardViewViewHolder cvh = new CardViewMusiBanyuasinAdapter.CardViewViewHolder(view);

        return cvh;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        holder.tvName.setText(listDestination.get(position).getName());
        holder.tvDescription.setText(listDestination.get(position).getDescription());

        holder.imgPhoto.setImageResource(listDestination.get(position).getPhotoId());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                FragmentManager manager = ((AppCompatActivity)view.getContext()).getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                if(position == 0){
                   /* SembilangNationalFragment sembilangNationalFragment = new SembilangNationalFragment();
                    ft.replace(R.id.frame_container, sembilangNationalFragment, "Banyuasin");*/
                    KongerLakeFragment kongerLakeFragment = new KongerLakeFragment();
                    ft.replace(R.id.frame_container, kongerLakeFragment, "Musibanyuasin");
                }
                else if(position == 1){
                    SekayuWaterfrontFragment sekayuWaterfrontFragment = new SekayuWaterfrontFragment();
                    ft.replace(R.id.frame_container, sekayuWaterfrontFragment, "Musibanyuuasin");
                }
                else if(position == 2){
                    UlakLiaLakeFragment ulakLiaLakeFragment = new UlakLiaLakeFragment();
                    ft.replace(R.id.frame_container, ulakLiaLakeFragment, "Musibanyuasin");
                }
                else if(position == 3){
                    RakitHouseFragment rakitHouseFragment = new RakitHouseFragment();
                    ft.replace(R.id.frame_container, rakitHouseFragment, "Musibanyuasin");
                }

                ft.addToBackStack("Musibanyuasin");
                ft.commit();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return listDestination.size();
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
