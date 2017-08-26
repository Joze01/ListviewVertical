package com.codetobe.listviewvertical;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {



    private List<Person> persons;
    private RecyclerView rv;



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            setContentView(R.layout.activity_main);

            rv=(RecyclerView)findViewById(R.id.rv);

            LinearLayoutManager llm = new LinearLayoutManager(this);
            rv.setLayoutManager(llm);
            rv.setHasFixedSize(true);

            initializeData();
            initializeAdapter();
    }



    private void initializeData(){
        persons = new ArrayList<>();
       persons.add(new Person("Jose Arteaga", "23 years old", R.mipmap.ic_yods));
        persons.add(new Person("Nombre", "23 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));
        persons.add(new Person("Juan Perez", "35 years old", R.mipmap.ic_yods));

    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }


}
