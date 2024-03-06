package kpi.team8_5.fourthlab.lab10;

import java.util.ArrayList;

public class MovieDatabase {
    private ArrayList<Actor> actors;
    private ArrayList<Movie> movies;
    public MovieDatabase(ArrayList<Actor> actors, ArrayList<Movie> movies) {
        this.actors = new ArrayList<Actor>(actors);
        this.movies = new ArrayList<Movie>(movies);
    }
    public ArrayList<Actor> getActors() {
        return new ArrayList<>(actors);
    }

    public ArrayList<Movie> getMovies() {
        return new ArrayList<>(movies);
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
