package com.example.alasif.testlistview_oop_27june;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Next extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        String name = getIntent().getStringExtra("name");
        String des = getIntent().getStringExtra("desc");
        String full = name+" "+des;
        Toast.makeText(Next.this,full,Toast.LENGTH_LONG).show();
    }
}
