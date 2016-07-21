package jlexdev.com.coordinator;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;


public class Coordinator3 extends AppCompatActivity implements View.OnClickListener {

    /* ********************************* */
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private ArrayList<Recycler> datos;
    /* ********************************* */

    private FloatingActionButton btnFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator3);
        Toolbar toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fab elevation by Snackbar"); // Título toolbar


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


        // FAB
        btnFab = (FloatingActionButton)findViewById(R.id.btn_fab);
        btnFab.setOnClickListener(this);
    }

    // Evento FAB
    @Override
    public void onClick(View v) {
        Snackbar.make(v, "Presionaste el Fab :P", Snackbar.LENGTH_SHORT).show();
    }

}
