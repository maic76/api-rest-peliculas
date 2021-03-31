package mx.maic76.springboot.restpeliculas.controllers;

import mx.maic76.springboot.restpeliculas.models.Pelicula;
import mx.maic76.springboot.restpeliculas.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeliculaController {

    @Autowired
    IPeliculaService peliculaService;

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas(){
        return peliculaService.findAll();
    }
}
