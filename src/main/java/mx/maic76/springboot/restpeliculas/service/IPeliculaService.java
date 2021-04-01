package mx.maic76.springboot.restpeliculas.service;

import mx.maic76.springboot.restpeliculas.models.Pelicula;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPeliculaService {

    public List<Pelicula> findAll();

    public void save(Pelicula);
}
