package com.tafe.mcintosh.messages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

//        Collect MY_MESSAGE from MainActivity class
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MY_MESSAGE);

//        Find TextView and set the text as 'message'
        TextView displayMsg = (TextView) findViewById(R.id.displayMsg);
        displayMsg.setText(message);

        Toast.makeText(
                this,
                "Message Delivered!",
                Toast.LENGTH_SHORT
        ).show();

    }
}
