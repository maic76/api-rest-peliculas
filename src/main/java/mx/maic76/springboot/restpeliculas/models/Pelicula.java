package mx.maic76.springboot.restpeliculas.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="peliculas")
public class Pelicula implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column( length = 100, nullable = false)
    private String title;

    private int year;

    @Column(length = 500)
    private String synopsis;

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Temporal(TemporalType.DATE)
    private Date created_at;

    public Pelicula() {
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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


    public Long getId() {
        return id;
    }

    private static final long serialVersionUID = 1L;
}
