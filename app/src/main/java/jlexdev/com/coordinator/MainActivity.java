package jlexdev.com.coordinator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**  Fuente:
 *   http://www.sgoliver.net/blog/animaciones-basicas-coordinatorlayout/
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstOpciones = (ListView)findViewById(R.id.lst_opciones);


        String[] datos =
                new String[]{
                        "1. Hide AppBar",
                        "2. Hide AppBar + Tabs",
                        "3. Fab elevation by Snackbar",
                        "4. Collapsing Toolbar",
                        "5. Fab + Collapsing toolbar",
                        "6. Collapsing con Fondo"
                };

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, datos);

        lstOpciones.setAdapter(adaptador);


        // Eventos
        lstOpciones.setOnItemClickListener(this);

    }

    // Llamada a Eventos
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0:
                Intent intent0 =
                        new Intent(this, Coordinator1.class);
                startActivity(intent0);
                break;

            case 1:
                Intent intent1 =
                        new Intent(this, Coordinator2.class);
                startActivity(intent1);
                break;

            case 2:
                Intent intent2 =
                        new Intent(this, Coordinator3.class);
                startActivity(intent2);
                break;

            case 3:
                Intent intent3 =
                        new Intent(this, Coordinator4.class);
                startActivity(intent3);
                break;

            case 4:
                Intent intent4 =
                        new Intent(this, Coordinator5.class);
                startActivity(intent4);
                break;

            case 5:
                Intent intent6 =
                        new Intent(this, Coordinator6.class);
                startActivity(intent6);
                break;


        }



    }
}
