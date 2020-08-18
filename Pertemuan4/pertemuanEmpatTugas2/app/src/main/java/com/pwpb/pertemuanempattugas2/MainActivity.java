package com.pwpb.pertemuanempattugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNextBtnClick(View view) {
        TextView txtNameBig = findViewById(R.id.txtNameBig);

        EditText edtTxtName = findViewById(R.id.edtTxtName);

        txtNameBig.setText(edtTxtName.getText().toString());
    }

    public void onKembaliBtnClick(View view) {
        TextView txtNameBig = findViewById(R.id.txtNameBig);

        txtNameBig.setText("Your Name Here");
    }

}