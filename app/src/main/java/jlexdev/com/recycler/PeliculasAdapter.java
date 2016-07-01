package jlexdev.com.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JLex on 22/06/16.
 * [ADAPTADOR]
 */
public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasHolder>{

    private ArrayList<Peliculas> datos;

    public PeliculasAdapter(ArrayList<Peliculas> datos) {
        this.datos = datos;
    }

    /** 3 Métodos de Adapter */
    @Override
    public PeliculasHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list_peliculas, parent, false);

        PeliculasHolder ph = new PeliculasHolder(v);
        return ph;
    }

    @Override
    public void onBindViewHolder(PeliculasHolder holder, int position) {

        Peliculas item = datos.get(position);
        holder.bindPeliculas(item);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


}
