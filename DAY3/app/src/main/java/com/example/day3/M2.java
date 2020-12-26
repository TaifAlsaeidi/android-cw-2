package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class M2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);

        TextView name = findViewById(R.id.thename);
        TextView phone = findViewById(R.id.thephone);
        TextView email = findViewById(R.id.theemail);
        TextView address = findViewById(R.id.theaddress);


        Bundle b = getIntent().getExtras();
        name.setText(b.getString("name"));
       phone.setText(b.getString("phone"));
        email.setText(b.getString("email"));
        address.setText(b.getString("Address"));

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+phone));
                startActivity(callIntent);

            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,b.getString("email"));
                email.putExtra(Intent.EXTRA_SUBJECT,"subject");
                        email.putExtra(Intent.EXTRA_TEXT,"message");
                        email.setType("Text/plain");
                        startActivity(Intent.createChooser(email,"Send email:"));
            }
        });






    }
}