package com.example.skoatpalace.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.button_add);
        Button buttonList = findViewById(R.id.button_acceslist);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText todoAdd = findViewById(R.id.edit_todoadd);
                String todoValue = todoAdd.getText().toString();
                Intent intent = new Intent(MainActivity.this,ToDoList.class);
                intent.putExtra("todoValue",todoValue);
                startActivity(intent);


            }
        });





        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ToDoList.class);
                startActivity(intent);

            }
        });


    }
}
