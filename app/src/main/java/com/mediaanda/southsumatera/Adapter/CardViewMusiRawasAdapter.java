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

import com.mediaanda.southsumatera.Fragment.AurLakeFragment;
import com.mediaanda.southsumatera.CustomOnItemClickListener;
import com.mediaanda.southsumatera.Fragment.Destination;
import com.mediaanda.southsumatera.Fragment.GegarLakeFragment;
import com.mediaanda.southsumatera.R;

import java.util.List;

public class CardViewMusiRawasAdapter extends RecyclerView.Adapter<CardViewMusiRawasAdapter.CardViewViewHolder> {
    private List<Destination> listDestination;
    private Context context;

    public CardViewMusiRawasAdapter(List<Destination> listDestination){
        this.listDestination = listDestination;
    }

    public void setListDestination(List<Destination> listDestination) {
        this.listDestination = listDestination;
    }

    @Override
    public CardViewMusiRawasAdapter.CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destination, parent, false);
        CardViewMusiRawasAdapter.CardViewViewHolder cvh = new CardViewMusiRawasAdapter.CardViewViewHolder(view);

        return cvh;
    }

    @Override
    public void onBindViewHolder(CardViewMusiRawasAdapter.CardViewViewHolder holder, int position) {
        holder.tvName.setText(listDestination.get(position).getName());
        holder.tvDescription.setText(listDestination.get(position).getDescription());

        holder.imgPhoto.setImageResource(listDestination.get(position).getPhotoId());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                FragmentManager manager = ((AppCompatActivity)view.getContext()).getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                if(position == 0){
                    /*SembilangNationalFragment sembilangNationalFragment = new SembilangNationalFragment();
                    ft.replace(R.id.frame_container, sembilangNationalFragment, "Banyuasin");*/
                    GegarLakeFragment gegarLakeFragment = new GegarLakeFragment();
                    ft.replace(R.id.frame_container, gegarLakeFragment, "Musirawas");
                }
                else if(position == 1){
                    AurLakeFragment aurLakeFragment = new AurLakeFragment();
                    ft.replace(R.id.frame_container, aurLakeFragment, "Musirawas");
                }

                ft.addToBackStack("MusiRawas");
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
