package com.example.can.bilmapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EventPassword extends AppCompatActivity {
    //decleare variables
    private  EditText editTextPassword;
    private  Button buttonPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_password);

        //initialize and find UI elements
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        buttonPassword = (Button) findViewById(R.id.buttonPassword);

        //open the event adding page when it is clicked
        buttonPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEventActivity();
            }
        });
    }

    /* Go to the events page... You will see and add events
     */
    public void openEventActivity(){
        String password = editTextPassword.getText().toString().trim();

        //Password: ugandaKnuckles
        if(!TextUtils.isEmpty(password) && password.equals("ugandaKnuckles")){
            Intent intent = new Intent(this, AddEventActivity.class);
            startActivity(intent);

            //display succsess message
            Toast.makeText(this, "Event page is opening", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "You have to enter the correct password...", Toast.LENGTH_LONG).show();
        }
    }
}
