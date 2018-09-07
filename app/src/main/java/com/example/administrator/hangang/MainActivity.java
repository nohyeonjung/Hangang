package com.example.administrator.hangang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ImageButton mainButton1;
    SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton1 = (ImageButton)findViewById(R.id.MainButton1);

        searchFragment = new SearchFragment();

        mainButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onFragmentChanged(1);

            }
        });
    }

    public void onFragmentChanged(int index){
    if(index==0){
//        getSupportFragmentManager().beginTransaction().replace(R.id.container,menuFragment).commit();
    }else if(index==1){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,searchFragment).commit();
    }
    }
}
