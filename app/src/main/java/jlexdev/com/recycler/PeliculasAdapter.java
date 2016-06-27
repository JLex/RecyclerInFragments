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
 */
public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder>{

    private ArrayList<Peliculas> datos;

    public PeliculasAdapter(ArrayList<Peliculas> datos) {
        this.datos = datos;
    }

    // 3 Métodos
    @Override
    public PeliculasAdapter.PeliculasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list_peliculas, parent, false);

        PeliculasViewHolder pvh = new PeliculasViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PeliculasAdapter.PeliculasViewHolder holder, int position) {

        Peliculas item = datos.get(position);

        holder.bindPEliculas(item);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


    // ViewHolder
    public class PeliculasViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgImagenPelicula;
        private TextView lblNombrePelicula;

        public PeliculasViewHolder(View itemView) {
            super(itemView);

            imgImagenPelicula = (ImageView)itemView.findViewById(R.id.img_imagen_pelicula);
            lblNombrePelicula = (TextView)itemView.findViewById(R.id.lbl_nombre_pelicula);
        }


        public void bindPEliculas(Peliculas item) {

            imgImagenPelicula.setImageResource(item.getImagenPeliculas());
            lblNombrePelicula.setText(item.getNombrePelicula());
        }
    }
}
