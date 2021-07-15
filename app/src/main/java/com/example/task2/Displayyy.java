package com.example.task2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.task2.databinding.ActivityDisplayyyBinding;

public class Displayyy extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityDisplayyyBinding binding;
    private TextView whole;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDisplayyyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent second = getIntent();

        String name = second.getStringExtra("name");
        String rno = second.getStringExtra("rno");

        whole = (TextView) findViewById(R.id.textView);
        whole.setText("Congratulations!!! \n on a successful registration \n"+ name + " \n("+rno+")");
    }

}