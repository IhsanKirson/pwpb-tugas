package com.pwpb.whatsappcontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<Contact> {
    List<Contact> contactList;
    Context context;
    int resource;

    public MyListAdapter(Context context, int resource, List<Contact> contactList) {
        super(context, resource, contactList);
        this.context = context;
        this.resource = resource;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null, false);

        ImageView imageView = view.findViewById(R.id.imgView);
        TextView textView = view.findViewById(R.id.txtView);
        TextView textViewStat = view.findViewById(R.id.txtViewStat);

        Contact contact = contactList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(contact.getImage()));
        textView.setText(contact.getName());
        textViewStat.setText(contact.getStat());

        return view;
    }
}
