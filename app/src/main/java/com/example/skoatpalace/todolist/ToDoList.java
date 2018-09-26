package com.example.skoatpalace.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoList extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listtodolist);

        ListView listView = findViewById(R.id.list_todo);

        ArrayList<ToDoModel> todomodels = new ArrayList<>();




        ToDoAdapter adapter = new ToDoAdapter(this, todomodels);
        listView.setAdapter(adapter);
    }

}
