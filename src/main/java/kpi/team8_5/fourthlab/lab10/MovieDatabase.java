package kpi.team8_5.fourthlab.lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieDatabase {
    private List<Actor> actors;
    private List<Movie> movies;
    public MovieDatabase(List<Actor> actors, List<Movie> movies) {
        this.actors = new ArrayList<Actor>(actors);
        this.movies = new ArrayList<Movie>(movies);
    }
    public List<Actor> getActors() {
        return new ArrayList<Actor>(actors);
    }

    public List<Movie> getMovies() {
        return new ArrayList<Movie>(movies);
    }
    public void addActor(Actor actor) throws IllegalArgumentException {
        if (actor == null) {
            throw new IllegalArgumentException("Cannot add a null actor.");
        }

        actors.add(actor);
    }

    public void addMovie(Movie movie) throws IllegalArgumentException {
        if (movie == null) {
            throw new IllegalArgumentException("Cannot add a null movie.");
        }

        movies.add(movie);
    }
}
