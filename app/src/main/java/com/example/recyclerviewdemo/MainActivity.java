package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String s1[],s2[];
    int image[]={R.drawable.ic_c_plus_plus,R.drawable.ic_c_sharp,R.drawable.ic_java,R.drawable.ic_js,R.drawable.ic_kotlin,R.drawable.ic_phython,R.drawable.ic_ruby,R.drawable.ic_swift,R.drawable.ic_typescript};
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=getResources().getStringArray(R.array.programming_languages);
        s2=getResources().getStringArray(R.array.description);

        recyclerView=findViewById(R.id.recycler_view);

        MyAdapter myAdapter=new MyAdapter(this,s1,s2,image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}