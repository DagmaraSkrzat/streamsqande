package pl.dominisz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Exercise from
 * https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 *
 * Convert the following code into a new implementation that uses lambda expressions and aggregate operations
 * instead of nested for loops.
 * Hint: Make a pipeline that invokes the filter, sorted, and collect operations, in that order.
 */
public class ExerciseTwo {

    private static Album[] albums;

    public static void main(String[] args) {
        Album[] albums;
        List<Album> favs = new ArrayList<>();

        for (Album a : albums) {
            boolean hasFavorite = false;
            for (Track t : a.getTracks()) {
                if (t.rating >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                favs.add(a);
        }
        Collections.sort(favs, new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                return a1.getName().compareTo(a2.getName());
            }
        });
    }
}
