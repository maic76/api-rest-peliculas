package mx.maic76.springboot.restpeliculas.models;

import javax.persistence.*;

@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int year;

    public Pelicula() {
    }

    public Pelicula(Long id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Id
    public Long getId() {
        return id;
    }
}
