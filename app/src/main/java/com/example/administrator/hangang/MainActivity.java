package com.example.administrator.hangang;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Fragment mainFragment;
    Fragment searchFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        searchFragment = new SearchFragment();

    }

    public void onFragmentChanged(int index){
        if(index==0){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,searchFragment).commit();
        }else if(index==1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
        }
    }
}
