package kpi.team8_5.fourthlab.lab10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<String> Execute(MovieDatabase movieDatabase, String withWho) {
        List<String> actorsReturning = new ArrayList<String>();
        for (Movie movie : movieDatabase.getMovies()) {
            List<String> actorsInMovie = movie.getActors();
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
