package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final EditText name = findViewById(R.id.name);
        EditText phone = findViewById(R.id.Phone);
        EditText email = findViewById(R.id.email);
        EditText Address = findViewById(R.id.Address);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,M2.class);
                String name1 = name.getText().toString();
                i.putExtra("name",name1);

                String phone1 = phone.getText().toString();
                i.putExtra("phone",phone1);

                String email1 = email.getText().toString();
                i.putExtra("email",email1);

                String Address1 = Address.getText().toString();
                i.putExtra("Address",Address1);

                startActivity(i);
            }
        });





        
    }
}