package mx.maic76.springboot.restpeliculas.service;

import mx.maic76.springboot.restpeliculas.models.Pelicula;
import mx.maic76.springboot.restpeliculas.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

    @Autowired
    PeliculaRepository repo;

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) repo.findAll();
    }
}
