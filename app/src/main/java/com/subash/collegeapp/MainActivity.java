package com.subash.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);

        List<contacts> contactsList = new ArrayList<>();
        contactsList.add(new contacts("Ram","985435255","Male","Balaju",R.drawable.male));
        contactsList.add(new contacts("Shreya","985345255","Female","Nepaltar",R.drawable.female));
        contactsList.add(new contacts("Gyan","985335255","Male","Bypass",R.drawable.male));


        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
