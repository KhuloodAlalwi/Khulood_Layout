package com.example.user.khulood_layout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 2/27/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    /*  Definr th list*/

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
    public void onBindViewHolder(ViewHolder holder, int position) {

        ListItem listItem = listItems.get(position);
        holder.textViewPlaceName.setText(listItem.getPlaceName());
        holder.textViewPlaceDesc.setText(listItem.getPlaceDesc());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        public TextView textViewPlaceName;
        public TextView textViewPlaceDesc;



/* alt+enter to creat constructor*/
        public ViewHolder(View itemView) {
            super(itemView);

            textViewPlaceName = (TextView) itemView.findViewById(R.id.textViewPlaceName);
            textViewPlaceDesc = (TextView) itemView.findViewById(R.id.textViewPlaceDesc);

        }
    }

}
