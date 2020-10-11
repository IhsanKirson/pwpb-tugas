package com.pwpb.whatsappcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> contactList;

    private String[] contact = {
            "Adityo", "Didan", "Defa", "Fadil", "Ihsan",
            "Arik", "Fachri", "Azhar", "Rasyid", "Syarif",
            "Aulia", "Nenden", "Dipta", "Alfian", "Iman"
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList = new ArrayList<>();
        listView = findViewById(R.id.listContainer);

        for (int i = 0; i < contact.length; i++) {
            String stat;
            if (i % 2 == 0) {
                stat = "Grateful.";
            } else {
                stat = "Lorem ipsum dolor sit amet.";
            }

            contactList.add(new Contact(R.drawable.ic_baseline_account_circle_24, contact[i], stat));
        }

        MyListAdapter adapter = new MyListAdapter(this, R.layout.custom_style, contactList);
        listView.setAdapter(adapter);
    }
}