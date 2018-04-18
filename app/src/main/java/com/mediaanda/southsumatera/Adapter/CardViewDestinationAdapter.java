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
import com.mediaanda.southsumatera.EmpatLawangFragment;
import com.mediaanda.southsumatera.Fragment.BanyuasinFragment;
import com.mediaanda.southsumatera.Fragment.PalembangFragment;
import com.mediaanda.southsumatera.Fragment.SembilangNationalFragment;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;

public class CardViewDestinationAdapter extends RecyclerView.Adapter<CardViewDestinationAdapter.CardViewViewHolder> {
    private List<Destination> listDestination;
    private Context context;

    public CardViewDestinationAdapter(List<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);
        CardViewViewHolder cvh = new CardViewViewHolder(view);

        return cvh;
    }

    @Override
    public void onBindViewHolder(final CardViewViewHolder holder, int position) {
        holder.tvName.setText(listDestination.get(position).getName());
        holder.tvDescription.setText(listDestination.get(position).getDescription());

        holder.imgPhoto.setImageResource(listDestination.get(position).getPhotoId());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                //Toast.makeText(view.getContext(), "Pilih : " + listDestination.get(position).getName(), Toast.LENGTH_SHORT).show();
                FragmentManager manager = ((AppCompatActivity) view.getContext()).getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                if (position == 0) {
                    PalembangFragment palembangFragment = new PalembangFragment();
                    ft.replace(R.id.frame_container, palembangFragment, "Destination");

                } else if (position == 1) {
                    BanyuasinFragment banyuasinFragment = new BanyuasinFragment();
                    ft.replace(R.id.frame_container, banyuasinFragment, "Destination");
                } else if (position == 2) {
                    EmpatLawangFragment empatLawangFragment = new EmpatLawangFragment();
                    ft.replace(R.id.frame_container, empatLawangFragment, "Destination");
                }

                ft.addToBackStack("Destination");
                ft.commit();
            }
        }));
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

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        ImageView imgPhoto;
        TextView tvName, tvDescription;
        Button btnDetail;

        CardViewViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv_destination);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_item_description);
            btnDetail = (Button) itemView.findViewById(R.id.btn_Detail);

        }
    }


}
