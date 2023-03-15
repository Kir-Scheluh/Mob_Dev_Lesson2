package com.mirea.schelukhinka.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String message;
    String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText messenger = (EditText) findViewById(R.id.TextToSend);
        Log.i(TAG, "onCreateMain");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStartMain");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResumeMain");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPauseMain");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStopMain");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroyMain");
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", message);
        startActivity(intent);
        
    }
    public void  sendText(View view){
        EditText messenger = (EditText) findViewById(R.id.TextToSend);
        message = messenger.getText().toString();
    }
}