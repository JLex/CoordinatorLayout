package jlexdev.com.coordinator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstOpciones = (ListView)findViewById(R.id.lst_opciones);


        String[] datos =
                new String[]{
                        "Hide AppBar",
                        "Hide AppBar + Tabs",
                        "Toolbar 3",
                        "Toolbar 4",
                        "Toolbar 5",
                        "Toolbar 6",
                        "Toolbar 7"
                };

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, datos);

        lstOpciones.setAdapter(adaptador);


        // Eventos
        lstOpciones.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0:
                Intent intent0 =
                        new Intent(this, Coordinator0.class);
                startActivity(intent0);
                break;

            case 1:
                Intent intent1 =
                        new Intent(this, Coordinator1.class);
                startActivity(intent1);
                break;

            case 2:
                Intent intent2 =
                        new Intent(this, Coordinator2.class);
                startActivity(intent2);
                break;

            case 3:
                Intent intent3 =
                        new Intent(this, Coordinator2.class);
                startActivity(intent3);
                break;

            case 4:
                Intent intent4 =
                        new Intent(this, Coordinator0.class);
                startActivity(intent4);
                break;

            case 5:
                Intent intent5 =
                        new Intent(this, Coordinator0.class);
                startActivity(intent5);
                break;


        }



    }
}
