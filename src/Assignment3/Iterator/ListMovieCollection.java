package Assignment3.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of movies stored in a List.
 * Provides functionality to add movies and create an iterator for traversal.
 */
public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    /**
     * Adds a movie to the collection.
     *
     * @param movie the name of the movie to add
     * @return the current ListMovieCollection instance for method chaining
     */
    public ListMovieCollection addMovie(String movie) {
        movies.add(movie);
        return this;
    }

    /**
     * Creates an iterator to traverse the movie collection.
     *
     * @return an Iterator instance for the movies list
     */
    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}
