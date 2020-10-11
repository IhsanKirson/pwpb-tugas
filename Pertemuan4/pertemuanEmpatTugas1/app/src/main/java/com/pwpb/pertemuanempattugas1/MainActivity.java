package com.pwpb.pertemuanempattugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDaftarBtnClick(View view) {
        TextView txtName = findViewById(R.id.txtName);

        EditText edtTxtName = findViewById(R.id.edtTxtName);

        txtName.setText(edtTxtName.getText().toString());

    }
}