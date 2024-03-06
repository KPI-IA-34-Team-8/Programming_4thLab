package kpi.team8_5.fourthlab.lab10;

import java.util.ArrayList;

public class Task2 {
    public static ArrayList<String> Execute(MovieDatabase movieDatabase, String withWho) {
        ArrayList<String> actorsReturning = new ArrayList<String>();
        for (Movie movie : movieDatabase.getMovies()) {
            ArrayList<String> actorsInMovie = movie.getActors();
            if (actorsInMovie.contains(withWho)) {
                for (String actor : actorsInMovie) {
                    if (actor.equals(withWho)) {
                        continue;
                    }
                    actorsReturning.add(actor);
                }
            }
        }
        return actorsReturning;
    }
}
