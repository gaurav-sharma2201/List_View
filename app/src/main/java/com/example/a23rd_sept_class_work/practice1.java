package com.example.a23rd_sept_class_work;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class practice1 extends AppCompatActivity {

    ListView listView;
    ListAdapter2 listAdapter2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);

        listView=findViewById(R.id.listview1);
      listView.setAdapter(new ListAdapter2(this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                   Toast.makeText(practice1.this, "Check int "+i, Toast.LENGTH_SHORT).show();
               }
           });

    }


}