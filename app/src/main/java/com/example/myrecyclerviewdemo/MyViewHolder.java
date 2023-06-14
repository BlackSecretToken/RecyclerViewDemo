package com.example.myrecyclerviewdemo;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView imageView;
    TextView nameView, emailView;
    Button shareButton;

    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        emailView = itemView.findViewById(R.id.email);
        shareButton = itemView.findViewById(R.id.shareButton);
        shareButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == shareButton) {
            int position = getAdapterPosition();
            // Do something with this position, like remove the item from the list
            Log.d("tag","-------------------share button ----------------------");
        }
    }
}
