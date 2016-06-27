package jlexdev.com.recycler;

/**
 * Created by JLex on 22/06/16.
 */
public class Peliculas {

    private int imagenPeliculas;
    private String nombrePelicula;

    public Peliculas(int imagenPeliculas, String nombrePelicula) {
        this.imagenPeliculas = imagenPeliculas;
        this.nombrePelicula = nombrePelicula;
    }

    public int getImagenPeliculas() {
        return imagenPeliculas;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }
}
