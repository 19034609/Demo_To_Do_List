package sg.edu.rp.c346.id19034609.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewDoList);
        alToDo = new ArrayList();

        alToDo.add(new ToDoItem("Go for movie", Calendar.getInstance()));
        alToDo.add(new ToDoItem("Go for haircut", Calendar.getInstance()));

        adapter = new CustomAdapter(this, R.layout.row, alToDo);
        lvToDo.setAdapter(adapter);
    }
}
