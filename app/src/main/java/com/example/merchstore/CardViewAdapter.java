package com.example.merchstore;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder>  {
    private ArrayList<Merch> listMerch;

    public CardViewAdapter(ArrayList<Merch> listMerch){
        this.listMerch = listMerch;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {
        final Merch merch = listMerch.get(i);

        Glide.with(holder.itemView.getContext())
                .load(merch.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(merch.getName());
        holder.tvPrice.setText(merch.getPrice());


        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Detail.class);
                Detail detail = new Detail();
                intent.putExtra(detail.EXTRA_PHOTO, merch.getPhoto());
                intent.putExtra(detail.EXTRA_NAME, merch.getName());
                intent.putExtra(detail.EXTRA_PRICE, merch.getPrice());
                intent.putExtra(detail.EXTRA_DESC, merch.getDesc());
                intent.putExtra(detail.EXTRA_CATE, merch.getCate());
                intent.putExtra(detail.EXTRA_SIZE, merch.getSize());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return listMerch.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardview;
        public ImageView imgPhoto;
        public TextView tvName, tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            cardview = itemView.findViewById(R.id.cardview);
        }
    }
}
