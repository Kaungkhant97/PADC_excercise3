package com.kaungkhantthu.padcexercise3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kaungkhantthu on 7/1/16.
 */
public class jobadapter extends RecyclerView.Adapter<jobadapter.jobsViewholder> {
    private final ArrayList<jobVO> jobsArraylist;

    public static class jobsViewholder extends RecyclerView.ViewHolder{
        TextView title,company,country,date;
        ImageView icon;
        public jobsViewholder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.jobtitle);
            company = (TextView) itemView.findViewById(R.id.jobcompany);
            country = (TextView) itemView.findViewById(R.id.jobcountry);
            date = (TextView) itemView.findViewById(R.id.jobdate);
            icon = (ImageView) itemView.findViewById(R.id.jobicon);

        }
    }

    public jobadapter(ArrayList<jobVO> jobVOArrayList) {

        this.jobsArraylist = jobVOArrayList;
    }

    @Override
    public jobadapter.jobsViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.jobitemlayout,parent,false);
        return new jobsViewholder(v);
    }

    @Override
    public void onBindViewHolder(jobadapter.jobsViewholder holder, int position) {
        holder.title.setText(jobsArraylist.get(position).getTitle());
        holder.company.setText(jobsArraylist.get(position).getCompany());
        holder.country.setText(jobsArraylist.get(position).getCountry());
        holder.date.setText(jobsArraylist.get(position).getJobDate());
        holder.icon.setImageResource(jobsArraylist.get(position).getIcon());

    }

    @Override
    public int getItemCount() {
        return jobsArraylist.size();
    }
}
