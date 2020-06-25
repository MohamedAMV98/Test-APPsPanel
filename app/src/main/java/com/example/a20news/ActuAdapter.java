package com.example.a20news;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a20news.Model.Actu;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;

public class ActuAdapter extends RecyclerView.Adapter<ActuAdapter.ActuViewHolder> {
    public List<Actu> theList;
    public Activity mActivity;

    public static class ActuViewHolder extends RecyclerView.ViewHolder{
        public TextView titreActu;
        public TextView dateActu;
        public TextView descActu;
        public ImageView imageActu;

        public ActuViewHolder(View itemView) {
            super(itemView);
            titreActu = itemView.findViewById(R.id.titreActu);
            dateActu = itemView.findViewById(R.id.dateActu);
            descActu = itemView.findViewById(R.id.descActu);
            imageActu = itemView.findViewById(R.id.miniatureActu);
        }
    }



    public ActuAdapter(List<Actu> aList) {
        theList = aList;
    }

    @NonNull
    @Override
    public ActuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemactu, parent, false);
        ActuViewHolder avh = new ActuViewHolder(v);
        return avh;
    }

    @Override
    public void onBindViewHolder(@NonNull ActuViewHolder holder, int position) {
        Actu currentNews = theList.get(position);
        holder.imageActu.setImageResource(R.drawable.ic_baseline_priority_high_24);
        holder.descActu.setText(currentNews.getDescription());
        holder.dateActu.setText(currentNews.getDate());
        holder.titreActu.setText(currentNews.getTitre());
    }

    @Override
    public int getItemCount() {
        return theList.size();
    }
}
