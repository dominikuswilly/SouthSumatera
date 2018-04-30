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
import com.mediaanda.southsumatera.Fragment.LematangWaterfallFragment;
import com.mediaanda.southsumatera.Fragment.MegalithSitesPagarAlamFragment;
import com.mediaanda.southsumatera.Fragment.MountDempoFragment;
import com.mediaanda.southsumatera.R;
import com.mediaanda.southsumatera.Fragment.TeaPlantationFragment;
import com.mediaanda.southsumatera.Fragment.TebatGhebanFragment;

import java.util.List;

public class CardViewPagaralamAdapter extends RecyclerView.Adapter<CardViewPagaralamAdapter.CardViewViewHolder>{
    private List<Destination> listDestination;
    private Context context;

    public CardViewPagaralamAdapter(List<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    public void setListDestination(List<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);
        CardViewPagaralamAdapter.CardViewViewHolder cvh = new CardViewPagaralamAdapter.CardViewViewHolder(view);

        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        holder.tvName.setText(listDestination.get(position).getName());
        holder.tvDescription.setText(listDestination.get(position).getDescription());

        holder.imgPhoto.setImageResource(listDestination.get(position).getPhotoId());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                FragmentManager manager = ((AppCompatActivity)view.getContext()).getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                if(position == 0){
                    MountDempoFragment mountDempoFragment = new MountDempoFragment();
                    ft.replace(R.id.frame_container, mountDempoFragment, "pagaralam");
                } else if(position == 1){
                    TeaPlantationFragment teaPlantationFragment = new TeaPlantationFragment();
                    ft.replace(R.id.frame_container, teaPlantationFragment, "pagaralam");
                } else if(position == 2){
                    LematangWaterfallFragment lematangWaterfallFragment = new LematangWaterfallFragment();
                    ft.replace(R.id.frame_container, lematangWaterfallFragment, "pagaralam");
                } else if(position == 3){
                    MegalithSitesPagarAlamFragment megalithSitesPagarAlamFragment = new MegalithSitesPagarAlamFragment();
                    ft.replace(R.id.frame_container, megalithSitesPagarAlamFragment, "pagaralam");
                } else if(position == 4){
                    TebatGhebanFragment tebatGhebanFragment = new TebatGhebanFragment();
                    ft.replace(R.id.frame_container, tebatGhebanFragment, "pagaralam");
                }

                ft.addToBackStack("pagaralam");
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
