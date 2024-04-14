package com.example.factorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtmsg;
    Button btncalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtmsg=(EditText) findViewById((R.id.txtmsg));
        btncalculate=(Button) findViewById(R.id.btnclaculate);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int use,fact=1,i;

                Bundle bundle=new Bundle();
                use=Integer.parseInt(txtmsg.getText().toString());
                for(i=1;i<=use;i++)
                {
                    fact=fact*i;
                }

                bundle.putInt("key",fact);
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}