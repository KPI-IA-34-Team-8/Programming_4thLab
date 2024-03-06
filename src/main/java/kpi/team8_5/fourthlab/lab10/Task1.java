package kpi.team8_5.fourthlab.lab10;

import java.util.*;

public class Task1 {
    public static String Execute(MovieDatabase movieDatabase) throws Exception {
        // To make a comment when there is no such actor that did not star in any movies
        boolean actor_with_no_movies = true;
        for (Iterator i = movieDatabase.getActors().iterator(); i.hasNext();) {
            // I hope I did this correctly..
            Object o = i.next();
            if (!(o instanceof Actor actor)) {
                // Just a sanity check.
                // This should never happen, but if it *somehow* does, it will error this message.
                throw new Exception("The object that was in the Actors list of a MovieDatabase is not an Actor.");
            }
            if (actor.getMovies().isEmpty()) {
                actor_with_no_movies = false;
                return actor.getName();
            }
        }
        return null;
    }
}
