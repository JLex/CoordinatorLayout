package jlexdev.com.coordinator;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Coordinator2 extends AppCompatActivity {


    /* ********************************* */
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private ArrayList<Recycler> datos;
    /* ********************************* */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator2);

        // Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hide AppBar + Tabs"); // Título toolbar

        // Tabs
        TabLayout tabLayout = (TabLayout)findViewById(R.id.app_bar_tabs);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        // Add Tabs
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        // Color Texto Tabs
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.blanco));


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


    }
}
