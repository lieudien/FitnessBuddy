package com.comp7081.project.fitnessbuddy.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.comp7081.project.fitnessbuddy.R;

public class DairyActivity extends AppCompatActivity {

    final static String[] items = {"Eggs", "Milk", "Tofu", "Bread", "Butter", "Cheese", "Yogurt", "Ice cream"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        ListView lvDairy = (ListView) findViewById(R.id.lvDairy);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        lvDairy.setAdapter(itemsAdapter);
    }
}
