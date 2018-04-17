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

import com.mediaanda.southsumatera.BalaputeraDewaFragment;
import com.mediaanda.southsumatera.Fragment.AlMunawarFragment;
import com.mediaanda.southsumatera.CustomOnItemClickListener;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.Fragment.AmperaFragment;
import com.mediaanda.southsumatera.Fragment.QuranFragment;
import com.mediaanda.southsumatera.Fragment.JakabaringFragment;
import com.mediaanda.southsumatera.Fragment.SiguntangHillFragment;
import com.mediaanda.southsumatera.Fragment.KambangIwakFragment;
import com.mediaanda.southsumatera.Fragment.KapitanVillageFragment;
import com.mediaanda.southsumatera.Fragment.KawahTengkurepFragment;
import com.mediaanda.southsumatera.Fragment.MasjidAgungFragment;
import com.mediaanda.southsumatera.KemaroIslandFragment;
import com.mediaanda.southsumatera.Market16IlirFragment;
import com.mediaanda.southsumatera.MonperaFragment;
import com.mediaanda.southsumatera.R;
import com.mediaanda.southsumatera.Fragment.WaterTowerFragment;
import com.mediaanda.southsumatera.SmbMuseumFragment;
import com.mediaanda.southsumatera.SongketCraftFragment;
import com.mediaanda.southsumatera.SriwijayaKingdomFragment;

import java.util.ArrayList;
import java.util.List;

public class CardViewPalembangAdapter extends RecyclerView.Adapter<CardViewPalembangAdapter.CardViewViewHolder> {
    private List<Destination> listDestination;
    private Context context;

    public CardViewPalembangAdapter(List<Destination> listDestination){
        this.listDestination = listDestination;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);
        CardViewViewHolder cvh = new CardViewViewHolder(view);

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
                //Toast.makeText(view.getContext(), "Pilih : " + listDestination.get(position).getName(), Toast.LENGTH_SHORT).show();
                FragmentManager manager = ((AppCompatActivity)view.getContext()).getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                if(position == 0){
                    AmperaFragment amperaFragment = new AmperaFragment();
                    ft.replace(R.id.frame_container, amperaFragment, "Palembang");
                }
                else if(position == 1){
                    QuranFragment quranFragment = new QuranFragment();
                    ft.replace(R.id.frame_container, quranFragment, "Palembang");
                }
                else if(position == 2){
                    JakabaringFragment jakabaringFragment = new JakabaringFragment();
                    ft.replace(R.id.frame_container, jakabaringFragment, "Palembang");
                }
                else if(position == 3){
                    WaterTowerFragment waterTowerFragment = new WaterTowerFragment();
                    ft.replace(R.id.frame_container, waterTowerFragment, "Palembang");
                }
                else if(position == 4){
                    SiguntangHillFragment siguntangHillFragment = new SiguntangHillFragment();
                    ft.replace(R.id.frame_container, siguntangHillFragment, "Palembang");
                }
                else if(position == 5){
                    KambangIwakFragment kambangIwakFragment = new KambangIwakFragment();
                    ft.replace(R.id.frame_container, kambangIwakFragment, "Palembang");
                }
                else if(position == 6){
                    KapitanVillageFragment kapitanVillageFragment = new KapitanVillageFragment();
                    ft.replace(R.id.frame_container, kapitanVillageFragment, "Palembang");
                }
                else if(position == 7){
                    AlMunawarFragment alMunawarFragment = new AlMunawarFragment();
                    ft.replace(R.id.frame_container, alMunawarFragment, "Palembang");
                }
                else if(position == 8){
                    KawahTengkurepFragment kawahTengkurepFragment = new KawahTengkurepFragment();
                    ft.replace(R.id.frame_container, kawahTengkurepFragment, "Palembang");
                }
                else if(position == 9){
                    MasjidAgungFragment masjidAgungFragment = new MasjidAgungFragment();
                    ft.replace(R.id.frame_container, masjidAgungFragment, "Palembang");
                }
                else if(position == 10){
                    MonperaFragment monperaFragment = new MonperaFragment();
                    ft.replace(R.id.frame_container, monperaFragment, "Palembang");
                }
                else if(position == 11){
                    SmbMuseumFragment smbMuseumFragment = new SmbMuseumFragment();
                    ft.replace(R.id.frame_container, smbMuseumFragment, "Palembang");
                }
                else if(position == 12){
                    BalaputeraDewaFragment balaputeraDewaFragment = new BalaputeraDewaFragment();
                    ft.replace(R.id.frame_container, balaputeraDewaFragment, "Palembang");
                }
                else if(position == 13){
                    SriwijayaKingdomFragment sriwijayaKingdomFragment = new SriwijayaKingdomFragment();
                    ft.replace(R.id.frame_container, sriwijayaKingdomFragment, "Palembang");
                }
                else if(position == 14){
                    KemaroIslandFragment kemaroIslandFragment = new KemaroIslandFragment();
                    ft.replace(R.id.frame_container, kemaroIslandFragment, "Palembang");
                }
                else if(position == 15){
                    Market16IlirFragment market16IlirFragment = new Market16IlirFragment();
                    ft.replace(R.id.frame_container, market16IlirFragment, "Palembang");
                }
                else if(position == 16){
                    SongketCraftFragment songketCraftFragment = new SongketCraftFragment();
                    ft.replace(R.id.frame_container, songketCraftFragment, "Palembang");
                }
                else if(position == 17){

                }

                ft.addToBackStack("Palembang");
                ft.commit();
            }
        }));
    }

    public void setListDestination(ArrayList<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
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
