package com.gcme.hascomamharic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.gcme.hascomamharic.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Created by buty on 1/4/16.
 */
public  class Feedback extends AppCompatActivity {

    Button buttonSend;
    EditText textSubject;
    EditText textTo;
    EditText textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        buttonSend =  findViewById(R.id.buttonSend);
        textTo =  findViewById(R.id.editTextTo);

        textSubject =  findViewById(R.id.editTextSubject);
        textMessage =  findViewById(R.id.editTextMessage);

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String to = textTo.getText().toString();
                String subject = textSubject.getText().toString();
                String message = textMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});

                email.putExtra(Intent.EXTRA_TEXT, message);
                email.putExtra(Intent.EXTRA_SUBJECT, subject);

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose  Email:"));


            }

        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_feedback);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        startActivity(new Intent(Feedback.this, MainActivity.class));
                        Animatoo.animateSplit(Feedback.this);
                        break;
                    case R.id.menu_teleshataol:
                        startActivity(new Intent(Feedback.this, TeleEshtaol.class));
                        Animatoo.animateSplit(Feedback.this);
                        break;
                    case R.id.menu_contact_us:
                        // startActivity(new Intent(Feedback.this, Feedback.class));
                        break;
                    case R.id.menu_about:
                        startActivity(new Intent(Feedback.this, AboutUs.class));
                        Animatoo.animateSplit(Feedback.this);
                        break;
                }
                return true;
            }
        });
    }

}


