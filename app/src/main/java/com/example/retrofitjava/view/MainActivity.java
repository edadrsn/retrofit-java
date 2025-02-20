package com.example.retrofitjava.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.retrofitjava.R;
import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/refs/heads/master/crypto.json




    }
}