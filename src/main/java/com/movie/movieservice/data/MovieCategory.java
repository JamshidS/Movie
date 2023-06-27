package com.movie.movieservice.data;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "movie_categories")
public class MovieCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "uuid")
    private String uuid;

    @ManyToOne
    private Movie movie;
}
