package jlexdev.com.coordinator;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Coordinator4 extends AppCompatActivity {

    /* ********************************* */
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private ArrayList<Recycler> datos;
    /* ********************************* */

    private CollapsingToolbarLayout ctLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator4);


        Toolbar toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    /** En lugar de ésta línea irá la -Final
        getSupportActionBar().setTitle("Collapsing Toolbar1"); // Título toolbar */

        /* *************************************************************** */
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        datos = new ArrayList<Recycler>();
        datos.add(new Recycler("¡Qué original! 1"));
        datos.add(new Recycler("¡Qué original! 2"));
        datos.add(new Recycler("¡Qué original! 3"));
        datos.add(new Recycler("¡Qué original! 4"));
        datos.add(new Recycler("¡Qué original! 5"));
        datos.add(new Recycler("¡Qué original! 6"));
        datos.add(new Recycler("¡Qué original! 7"));
        datos.add(new Recycler("¡Qué original! 8"));
        datos.add(new Recycler("¡Qué original! 9"));
        datos.add(new Recycler("¡Qué original! 10"));
        datos.add(new Recycler("¡Qué original! 11"));
        datos.add(new Recycler("¡Qué original! 12"));
        datos.add(new Recycler("¡Qué original! 13"));
        datos.add(new Recycler("¡Qué original! 14"));
        datos.add(new Recycler("¡Qué original! 15"));
        datos.add(new Recycler("¡Qué original! 16"));
        datos.add(new Recycler("¡Qué original! 17"));
        datos.add(new Recycler("¡Qué original! 18"));
        datos.add(new Recycler("¡Qué original! 19"));
        datos.add(new Recycler("¡Qué original! 20"));

        // Adaptador
        adapter = new RecyclerAdapter(datos);
        recyclerView.setAdapter(adapter);

        // Layout Manager
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        );
        /* *************************************************************** */


        // Collapsing Toolbar Layout
        ctLayout = (CollapsingToolbarLayout)findViewById(R.id.ct_layout);
        ctLayout.setTitle("Collapsing Toolbar"); // Titulo New toolbar

    }
}
