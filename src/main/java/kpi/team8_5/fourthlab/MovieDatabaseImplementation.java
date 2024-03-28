package kpi.team8_5.fourthlab;

import kpi.team8_5.fourthlab.lab10.Actor;
import kpi.team8_5.fourthlab.lab10.Movie;
import kpi.team8_5.fourthlab.lab10.MovieDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDatabaseImplementation {
    private static final List<Actor> actors = List.of(
            new Actor("Tom Hanks", new ArrayList<String>(List.of("Forrest Gump", "Saving Private Ryan"))),
            new Actor("Julia Roberts", new ArrayList<String>(List.of("Pretty Woman", "Erin Brockovich"))),
            new Actor("Leonardo DiCaprio", new ArrayList<String>(List.of("Titanic", "Inception")))
    );
    private static final List<Movie> movies = List.of(
            new Movie("Forrest Gump", new ArrayList<String>(List.of("Tom Hanks", "Robin Wright",
                    "Gary Sinise", "Sally Field"))),
            new Movie("Pretty Woman", new ArrayList<String>(List.of("Julia Roberts", "Richard Gere"))),
            new Movie("Titanic", new ArrayList<String>(List.of("Tom Hanks", "Kate Winslet",
                    "Billy Zane")))
    );

    private static final MovieDatabase movieDatabase = new MovieDatabase(actors, movies);

    public static MovieDatabase getDatabase() {
        return movieDatabase;
    }
}
