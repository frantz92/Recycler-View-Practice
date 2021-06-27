package com.example.androidproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView theList = findViewById(R.id.recycler_view_project);

        Project[] projects = {
                new Project("Getting Starter App", "First Project with RecyclerView", R.drawable.getting_started),
                new Project("Vin Quote", "First Project with 'HelloWorld'", R.drawable.quote),
                new Project("BMI Calculator", "Methods, Conditional Logic", R.drawable.calculator),
                new Project("Inches Converter", "Calculator, converter", R.drawable.tape),
                new Project("Strzelecka 18", "Restaurant app", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        theList.setAdapter(adapter);

    }
}