package com.example.lttbdd_lab04_b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context ctx;
    private int layout;
    private ArrayList<ElectricThing> arrayList;

    public CustomAdapter(Context ctx, int layout, ArrayList<ElectricThing> arrayList) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;
        if (view==null){
            view = LayoutInflater.from(ctx).inflate(layout, viewGroup, false);

            viewHolder = new ViewHolder();

            viewHolder.textViewName = view.findViewById(R.id.textViewName);
            viewHolder.textViewPrice = view.findViewById(R.id.textViewPrice);
            viewHolder.textViewPeopleRate = view.findViewById(R.id.textViewPeopleRate);
            viewHolder.textViewReducePercent = view.findViewById(R.id.textViewReducePercent);
            viewHolder.imageThing = view.findViewById(R.id.imageThing);
            viewHolder.ratingBar = view.findViewById(R.id.ratingBar);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.textViewName.setText(arrayList.get(i).getName());
        viewHolder.textViewPrice.setText(String.valueOf(arrayList.get(i).getNewPrice()));
        viewHolder.textViewPeopleRate.setText(String.valueOf(arrayList.get(i).getPeopleRate()));
        viewHolder.textViewReducePercent.setText(String.valueOf(arrayList.get(i).getReducePercent()));
        viewHolder.imageThing.setImageResource(arrayList.get(i).getImageThing());
        viewHolder.ratingBar.setRating(arrayList.get(i).getRate());

        return view;
    }
    private class ViewHolder{
        TextView textViewName;
        TextView textViewPrice;
        TextView textViewPeopleRate;
        TextView textViewReducePercent;
        ImageView imageThing;
        RatingBar ratingBar;
    }
}
