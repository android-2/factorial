package com.example.factorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        txtresult=(TextView) findViewById(R.id.txtresult);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        int val= bundle.getInt("key");
        String str=String.valueOf(val);
        txtresult.setText(str);



    }
}