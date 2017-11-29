package com.example.joy.listview7;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joy on 11/26/17.
 */

public class CustomAdapter extends BaseAdapter {


    private List<DataModel> list=new ArrayList<>();
    private Context context;

    public CustomAdapter(Context context,List<DataModel> list) {

        this.list=list;
        this.context=context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view= LayoutInflater.from(context).inflate(R.layout.list_view,viewGroup,false);

        DataModel dataModel= (DataModel) getItem(i);

        ViewHolder holder=new ViewHolder(view);

        holder.brand.setText(dataModel.brand);
        holder.imageView.setImageResource(dataModel.img);


        return view;
    }


    private class ViewHolder {

        private TextView brand;
        private ImageView imageView;

        public ViewHolder(View view) {

            brand=view.findViewById(R.id.brand_name);
            imageView=view.findViewById(R.id.image_view);
        }
    }







}
