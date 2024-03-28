package kpi.team8_5.fourthlab.lab10;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private final String name;
    private final List<String> movies;
    public Actor(String name, List<String> movies) {
        this.name = name;
        this.movies = new ArrayList<>(movies);
    }

    public List<String> getMovies() {
        return new ArrayList<>(this.movies);
    }

    public String getName() {
        return this.name;
    }
}
