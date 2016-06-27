package jlexdev.com.coordinator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JLex on 24/06/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private ArrayList<Recycler> datos;

    public RecyclerAdapter(ArrayList<Recycler> datos) {
        this.datos = datos;
    }

    @Override
    public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.design_recycler, parent, false);

        RecyclerViewHolder rvh = new RecyclerViewHolder(view);

        return rvh;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.RecyclerViewHolder holder, int position) {
        Recycler i = datos.get(position);

        holder.bindRecycler(i);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView lblNombre;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            lblNombre = (TextView)itemView.findViewById(R.id.lbl_nombre);
        }

        public void bindRecycler(Recycler i) {
            lblNombre.setText(i.getNombre());
        }
    }

}
