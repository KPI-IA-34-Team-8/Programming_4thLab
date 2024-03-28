package kpi.team8_5.fourthlab.lab10;

import java.util.*;

public class Task3 {
    public static String Execute(MovieDatabase movieDatabase) {
        String popular_movie_name = "";
        int actor_count = 0;

        for (Iterator<Movie> i = movieDatabase.getMovies().iterator();
             i.hasNext();) {
            Movie movie = i.next();

            //Find a film the most amount of actors was staring in
            List<String> names = movie.getActors();
            if(names.size() > actor_count){
                actor_count = names.size();
                popular_movie_name = movie.getName();
            }
        }
        return popular_movie_name;
    }
}
