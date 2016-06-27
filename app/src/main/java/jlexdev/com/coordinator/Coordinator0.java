package jlexdev.com.coordinator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Coordinator0 extends AppCompatActivity {


    /* ********************************* */
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private ArrayList<Recycler> datos;
    /* ********************************* */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator0);

        Toolbar toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hide AppBar");


        /* *************************************************************** */
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        datos = new ArrayList<Recycler>();
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));
            datos.add(new Recycler("¡Qué original! :P"));

        // Adaptador
        adapter = new RecyclerAdapter(datos);
        recyclerView.setAdapter(adapter);

        // Layout Manager
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        );
        /* *************************************************************** */


    }

}
