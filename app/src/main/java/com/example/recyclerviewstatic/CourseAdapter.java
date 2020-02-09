package com.example.recyclerviewstatic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
   String[] data;
   public CourseAdapter(String[] data) {
       this.data = data;
    }


    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item,parent,false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
        String title = data[position];
        holder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public CourseViewHolder(View itemview) {
            super(itemview);
            imageView = itemview.findViewById(R.id.imageview);
            textView = itemview.findViewById(R.id.title);
        }
    }
}
