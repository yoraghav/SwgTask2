package com.example.task2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.task2.databinding.ActivityMainBinding;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    EditText name,rno;
    Button enroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        name  = (EditText) findViewById(R.id.name);
        rno  = (EditText) findViewById(R.id.rollnumber);
        enroll = (Button) findViewById(R.id.buttonenroll);

    }

    public void enroll(View v){
        String n = name.getText().toString();
        String r = rno.getText().toString();
        System.out.println("yelooo "+n);
        Toast.makeText(MainActivity.this,"Successful Enrollment!!!",Toast.LENGTH_SHORT).show();
        Intent second = new Intent(MainActivity.this,Displayyy.class);


        second.putExtra("name",n);
        second.putExtra("rno",r);
        startActivity(second);


    }
}