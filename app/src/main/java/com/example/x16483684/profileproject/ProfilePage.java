package com.example.x16483684.profileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfilePage extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);


        b = (Button)findViewById(R.id.btn);
        final EditText e1 = (EditText)findViewById(R.id.edit_username);
        final EditText e2 = (EditText)findViewById(R.id.edit_name);
        final EditText e3 = (EditText)findViewById(R.id.edit_birthday);
        final EditText e4 = (EditText)findViewById(R.id.edit_interest);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v){

                Intent intent = new Intent(ProfilePage.this,Profile2Page.class);

                intent.putExtra("username",e1.getText().toString());
                intent.putExtra("name",e2.getText().toString());
                intent.putExtra("birthday",e3.getText().toString());
                intent.putExtra("interest",e4.getText().toString());
                startActivity(intent);
            }
        });

    }
}
