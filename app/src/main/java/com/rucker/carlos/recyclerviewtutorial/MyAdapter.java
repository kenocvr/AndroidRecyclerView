package com.rucker.carlos.recyclerviewtutorial;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Carlos on 12/9/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

         final ListItem listItem = listItems.get(position);
         holder.textViewHead.setText(listItem.getHead());
         holder.textViewDesc.setText(listItem.getDesc());
         holder.linearLayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast
                         .makeText(context, "Clicked on... " + listItem.getHead(), Toast.LENGTH_LONG)
                         .show();
             }
         });
    }

    @Override
    public int getItemCount() {
        return listItems.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHead;
        public TextView textViewDesc;
        public LinearLayoutCompat linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
            linearLayout = (LinearLayoutCompat) itemView.findViewById(R.id.linearLayout);
        }
    }
}
