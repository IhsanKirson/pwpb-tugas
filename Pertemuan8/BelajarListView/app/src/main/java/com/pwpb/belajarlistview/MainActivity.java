package com.pwpb.belajarlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] youtubeChannel = {"MALINDA", "MALINDA 1", "MALINDA 2", "MALINDA 3",
            "MALINDA 4", "MALINDA 5", "MALINDA 6", "MALINDA 7", "MALINDA 8", "MALINDA 9",
            "MALINDA 10", "MALINDA 11", "MALINDA 12", "MALINDA 13"};

    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listContainer);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.custom_style, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    private void getData() {
        Collections.addAll(data, youtubeChannel);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String getYoutubeChannel = data.get(position);
        Toast.makeText(this, getYoutubeChannel + " subscribed", Toast.LENGTH_SHORT).show();
    }
}