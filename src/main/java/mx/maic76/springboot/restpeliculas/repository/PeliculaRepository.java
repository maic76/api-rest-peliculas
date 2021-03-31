package mx.maic76.springboot.restpeliculas.repository;

import mx.maic76.springboot.restpeliculas.models.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {

}
