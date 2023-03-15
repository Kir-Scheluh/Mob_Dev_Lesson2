package com.mirea.schelukhinka.multiactivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.mirea.schelukhinka.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    String TAG = SecondActivity.class.getSimpleName();
    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String text = (String) getIntent().getSerializableExtra("key");
        TextView receivedText = findViewById(R.id.RecievedText);
        receivedText.setText(text);
        Log.i(TAG, "onCreateSecond");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStartSecond");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResumeSecond");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPauseSecond");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStopSecond");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroySecond");
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}