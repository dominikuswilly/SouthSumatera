package com.mediaanda.southsumatera.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
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
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.Fragment.LesungBatuFragment;
import com.mediaanda.southsumatera.Fragment.NapalLicinFragment;
import com.mediaanda.southsumatera.R;
import com.mediaanda.southsumatera.Fragment.TingkipTempleFragment;

import java.util.List;

public class CardViewMurataraAdapter extends RecyclerView.Adapter<CardViewMurataraAdapter.CardViewViewHolder> {
    private List<Destination> listDestination;
    private Context context;

    public void setListDestination(List<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    public CardViewMurataraAdapter(List<Destination> listDestination) {

        this.listDestination = listDestination;
    }

    @Override
    public CardViewMurataraAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);
        CardViewMurataraAdapter.CardViewViewHolder cvh = new CardViewMurataraAdapter.CardViewViewHolder(view);

        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewMurataraAdapter.CardViewViewHolder holder, int position) {
        holder.tvName.setText(listDestination.get(position).getName());
        holder.tvDescription.setText(listDestination.get(position).getDescription());

        holder.imgPhoto.setImageResource(listDestination.get(position).getPhotoId());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                FragmentManager manager = ((AppCompatActivity)view.getContext()).getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                if(position == 0){
                    LesungBatuFragment lesungBatuFragment = new LesungBatuFragment();
                    ft.replace(R.id.frame_container, lesungBatuFragment, "muratara");
                } else if(position == 1){
                    TingkipTempleFragment tingkipTempleFragment = new TingkipTempleFragment();
                    ft.replace(R.id.frame_container, tingkipTempleFragment, "muratara");
                } else if(position == 2){
                    NapalLicinFragment napalLicinFragment = new NapalLicinFragment();
                    ft.replace(R.id.frame_container, napalLicinFragment, "muratara");
                }

                ft.addToBackStack("muratara");
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
