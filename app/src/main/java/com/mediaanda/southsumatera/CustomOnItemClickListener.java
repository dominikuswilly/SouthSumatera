package com.mediaanda.southsumatera;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback){
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
    // disini
    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }
}
