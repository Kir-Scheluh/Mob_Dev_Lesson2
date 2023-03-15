package com.mirea.schelukhinka.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void btnClick(View view){
        EditText editText = (EditText) findViewById(R.id.plainText);
        int length = editText.length();
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ №27 ГРУППА БСБО-01-20 Количество символов: " + length,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}