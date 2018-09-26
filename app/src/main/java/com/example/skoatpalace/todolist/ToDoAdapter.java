package com.example.skoatpalace.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class ToDoAdapter extends ArrayAdapter<ToDoModel> {

    public ToDoAdapter(Context context, ArrayList<ToDoModel> todomodels) {
        super(context, 0, todomodels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
                ToDoModel todo = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_todo, parent, false);
        }
        TextView todoValue = convertView.findViewById(R.id.text_todo);
        CheckBox checkValue = convertView.findViewById(R.id.check_todo);
        todoValue.setText(todo.getDescription());
        checkValue.setChecked(todo.isDone());
        return convertView;
    }
}
