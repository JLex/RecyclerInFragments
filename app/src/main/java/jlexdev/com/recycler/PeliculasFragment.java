package jlexdev.com.recycler;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PeliculasFragment extends Fragment {

    // Instancias globales
    private RecyclerView recyclerPeliculas;
    private RecyclerView.Adapter adapterPeliculas;
    private RecyclerView.LayoutManager layoutManagerPeliculas;

    private ArrayList<Peliculas> datos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_peliculas, container, false);


        // Cargo DATOS -------- :D :D :D :D :D --------
        datos = new ArrayList<Peliculas>();
            datos.add(new Peliculas(R.drawable.img_alvin, "Alvin y las Ardillas"));
            datos.add(new Peliculas(R.drawable.img_angry, "Angry Birds"));
            datos.add(new Peliculas(R.drawable.img_cazador, "El Cazador y la Reina del Hielo"));
            datos.add(new Peliculas(R.drawable.img_civilwar, "Civil War"));
            datos.add(new Peliculas(R.drawable.img_deadpool, "DeadPool"));
            datos.add(new Peliculas(R.drawable.img_dioses, "Dioses de Egipto"));
            datos.add(new Peliculas(R.drawable.img_era, "La era de Hielo"));
            datos.add(new Peliculas(R.drawable.img_jobs, "Steve Jobs"));
            datos.add(new Peliculas(R.drawable.img_panda, "Kung Fu Panda"));
            datos.add(new Peliculas(R.drawable.img_xmen, "X-Men Apocalipsis"));



        // Inicializo RecyclerView (usando el View que inflé)
        recyclerPeliculas = (RecyclerView)view.findViewById(R.id.recycler_peliculas);
        recyclerPeliculas.setHasFixedSize(true);

        // Adaptador
        adapterPeliculas = new PeliculasAdapter(datos);
        recyclerPeliculas.setAdapter(adapterPeliculas);

        // Layout Manager
        layoutManagerPeliculas = new GridLayoutManager(getActivity(), 2);
        recyclerPeliculas.setLayoutManager(layoutManagerPeliculas);

        return view;
    }

}
