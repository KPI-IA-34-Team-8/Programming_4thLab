package kpi.team8_5.fourthlab.lab10;

import java.util.ArrayList;

public class Actor {
    private final String name;
    private final ArrayList<String> movies;
    public Actor(String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = new ArrayList<>(movies);
    }

    public ArrayList<String> getMovies() {
        return new ArrayList<>(this.movies);
    }

    public String getName() {
        return this.name;
    }
}
