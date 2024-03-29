package com.subash.collegeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{
    Context mContext;
    List<contacts> contactsList;
    public ContactsAdapter(Context mContext, List<contacts> contactsList){
        this.mContext = mContext;
        this.contactsList = contactsList;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.linear_layouts,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        contacts contacts = contactsList.get(position);
        holder.imageView.setImageResource(contacts.getImageId());
        holder.tvname.setText(contacts.getName());
        holder.tvphone.setText(contacts.getPhoneNo());
        holder.tvgender.setText(contacts.getGender());
        holder.tvaddress.setText(contacts.getAddress());




    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        TextView tvname, tvphone, tvgender, tvaddress;
        ImageView imageView;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewPP);
            tvname = itemView.findViewById(R.id.tvname);
            tvphone = itemView.findViewById(R.id.tvphone);
            tvgender = itemView.findViewById(R.id.tvgender);
            tvgender = itemView.findViewById(R.id.tvaddress);



        }
    }
}
