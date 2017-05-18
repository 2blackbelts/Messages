package com.tafe.mcintosh.messages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MY_MESSAGE = "com.tafe.mcintosh.messages.MY_MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        announce("Type you name");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText messageBox = (EditText) findViewById(R.id.messageBox);
        String message = messageBox.getText().toString();
        intent.putExtra(MY_MESSAGE, message);
        startActivity(intent);
    }

    public void announce(String msg){
        Toast.makeText(
                this,
                msg,
                Toast.LENGTH_SHORT
        ).show();
    }
}
