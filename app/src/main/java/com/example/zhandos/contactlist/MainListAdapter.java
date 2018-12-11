package com.example.zhandos.contactlist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhandos on 12/11/18.
 */

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder> {
    private List<Contact> contactList;
    private Context context;

    public Context getContext() {
        return this.context;
    }

    public MainListAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public MainListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainListAdapter.ViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.tvContactName.setText(contact.getName());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvContactName;

        public ViewHolder(View itemView) {
            super(itemView);
            tvContactName = (TextView) itemView.findViewById(R.id.tvContactName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Contact contact = contactList.get(getAdapterPosition());
            Intent intent = new Intent(getContext(), ContactInfoActivity.class);
            intent.putExtra("CONTACT", contact);
            getContext().startActivity(intent);
        }
    }
}
