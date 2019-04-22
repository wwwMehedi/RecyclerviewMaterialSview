package com.tolet.sajib.recyclerviewprogressdialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Holder>{
    private List<String> countries;
    private Context context;

    public Adapter(List<String> countries, Context context) {
        this.countries = countries;
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.itemlist, parent, false);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        String country = countries.get(position);
        holder.text.setText(country);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
        notifyDataSetChanged();
    }


}