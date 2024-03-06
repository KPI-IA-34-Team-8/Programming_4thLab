package kpi.team8_5.fourthlab.lab10;

import java.util.ArrayList;

public class Movie {
    private final String name;
    private final ArrayList<String> actors;
    public Movie(String name, ArrayList<String> actors) {
        this.name = name;
        this.actors = new ArrayList<>(actors);
    }

    public ArrayList<String> getActors() {
        return new ArrayList<>(this.actors);
    }

    public String getName() {
        return this.name;
    }
}
