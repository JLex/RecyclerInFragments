package jlexdev.com.recycler;

/**
 * Created by JLex on 22/06/16.
 */
public class Peliculas {

    private int imagenPelicula;
    private String nombrePelicula;

    public Peliculas(int imagenPeliculas, String nombrePelicula) {
        this.imagenPelicula = imagenPeliculas;
        this.nombrePelicula = nombrePelicula;
    }

    public int getImagenPeliculas() {
        return imagenPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }
}
