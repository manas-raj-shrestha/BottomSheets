package com.droid.manasshrestha.bottomsheets;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link android.support.v7.widget.RecyclerView.Adapter} for contacts
 */
public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final ArrayList<Contact> contacts;
    private final Context context;
    private final ContactClickListener contactClickListener;

    public ContactsAdapter(Context context, ArrayList<Contact> contacts) {
        this.contacts = contacts;
        this.context = context;
        this.contactClickListener = (ContactClickListener) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.tvContactName.setText(contacts.get(position).getContactName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactClickListener.OnContactClicked(contacts.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    /**
     * {@link android.support.v7.widget.RecyclerView.ViewHolder}
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvContactName;
        ImageView ivContactPhoto;

        public ViewHolder(View itemView) {
            super(itemView);

            tvContactName = (TextView) itemView.findViewById(R.id.tv_contact_name);
            ivContactPhoto = (ImageView) itemView.findViewById(R.id.iv_contact_photo);
        }
    }

}
