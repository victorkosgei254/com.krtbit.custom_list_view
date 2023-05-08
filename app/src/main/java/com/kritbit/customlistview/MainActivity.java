package com.kritbit.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private static CustomAdapter adapter;
    ArrayList<LanguageModelClass> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adapter view
        listView = findViewById(R.id.listView);

        //datasource
        dataModels = new ArrayList<>();
        dataModels.add(new LanguageModelClass("Python",
                "Website development, backend, desktop applications, scripting",
                R.drawable.ic_python
        ));
        dataModels.add(new LanguageModelClass("Java",
                "Website development, backend, desktop applications, Android app development",
                R.drawable.ic_java
        ));

        dataModels.add(new LanguageModelClass("HTML",
                "Website development, desktop applications",
                R.drawable.ic_html
        ));

        dataModels.add(new LanguageModelClass("CSS",
                "Website design and animations",
                R.drawable.ic_css
        ));

        dataModels.add(new LanguageModelClass("Go",
                "Website development, backend, desktop applications, message brokers and queues",
                R.drawable.ic_golang
        ));

        dataModels.add(new LanguageModelClass("PHP",
                "Website development, backend, desktop applications, scripting, wordpress, plugins",
                R.drawable.ic_php
        ));

        dataModels.add(new LanguageModelClass("JavaScript",
                "Website development, backend, desktop applications, scripting",
                R.drawable.ic_js
        ));
        //adapter
        adapter = new CustomAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);

        //Handling the click events on list view items
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(MainActivity.this,
                    "adapter.getItem(i).getLanguage_use()",
                    Toast.LENGTH_LONG).show();
        });
    }
}