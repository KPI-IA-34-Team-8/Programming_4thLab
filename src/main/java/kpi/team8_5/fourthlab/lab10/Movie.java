package kpi.team8_5.fourthlab.lab10;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String name;
    private final List<String> actors;
    public Movie(String name, List<String> actors) {
        this.name = name;
        this.actors = new ArrayList<>(actors);
    }

    public List<String> getActors() {
        return new ArrayList<>(this.actors);
    }

    public String getName() {
        return this.name;
    }
}
