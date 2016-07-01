package jlexdev.com.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JLex on 30/06/16.
 * [VIEWHOLDER]
 */
public class PeliculasHolder extends RecyclerView.ViewHolder {

    private ImageView imgImagenPelicula;
    private TextView tvNombrePelicula;

    public PeliculasHolder(View itemView) {
        super(itemView);

        imgImagenPelicula = (ImageView)itemView.findViewById(R.id.img_imagen_pelicula);
        tvNombrePelicula = (TextView)itemView.findViewById(R.id.tv_nombre_pelicula);
    }

    public void bindPeliculas(Peliculas item) {

        imgImagenPelicula.setImageResource(item.getImagenPeliculas());
        tvNombrePelicula.setText(item.getNombrePelicula());
    }
}
