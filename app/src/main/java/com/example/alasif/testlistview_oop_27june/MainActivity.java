package com.example.alasif.testlistview_oop_27june;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Poet> P =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.firstListView);
        final Poet p1 = new Poet();
        P = p1.getAllPoets();


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, P);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,P.get(i).getName(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, Next.class);
                intent.putExtra("name",p1.getName());
                intent.putExtra("desc",String.valueOf(p1.getDescription()));
                startActivity(intent);
            }
        });
    }
}
