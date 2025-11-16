package com.example.toastmasters.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.toastmasters.R;

import java.util.ArrayList;

public class MyGalleryAdapter extends ArrayAdapter<ToastmastersGalaryModel> {
    private ArrayList<ToastmastersGalaryModel> toastmastersList;
    Context context;

    public MyGalleryAdapter(ArrayList<ToastmastersGalaryModel> toastmastersList, Context context)
    {
        super(context, R.layout.grid_item_layout, toastmastersList);
        this.toastmastersList=toastmastersList;
        this.context=context;
    }

    private static class MyViewHolder{
        TextView nameView;
        TextView roleView;
        ImageView image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ToastmastersGalaryModel toastmastersGalaryModel = getItem(position);
        MyViewHolder holder;

        if(convertView == null)
        {
            holder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView=inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            holder.image=(ImageView)  convertView.findViewById(R.id.profileimage);
            holder.nameView=(TextView) convertView.findViewById(R.id.names_id);
            holder.roleView=(TextView) convertView.findViewById(R.id.role_id);

            convertView.setTag(holder);
        }
        else
        {
            holder = (MyViewHolder) convertView.getTag();
        }

        holder.nameView.setText(toastmastersGalaryModel.getName());
        holder.roleView.setText(toastmastersGalaryModel.getRole());
        holder.image.setImageResource(toastmastersGalaryModel.getImage());

        return convertView;
    }
}
