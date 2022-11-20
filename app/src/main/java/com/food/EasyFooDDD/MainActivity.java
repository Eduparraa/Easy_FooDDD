package com.food.EasyFooDDD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.food.EasyFooDDD.Entidades.ConexionSQLiteHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this, "bd_usuarios",null,1);

    }
}