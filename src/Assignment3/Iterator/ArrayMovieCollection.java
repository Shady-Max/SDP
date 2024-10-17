package Assignment3.Iterator;

/**
 * Represents a collection of movies stored in an array.
 * Provides functionality to add movies and create an iterator for traversal.
 */
public class ArrayMovieCollection {
    private String[] movies;
    private int size = 0;

    /**
     * Constructs an ArrayMovieCollection with the specified capacity.
     *
     * @param capacity the maximum number of movies the collection can hold
     */
    public ArrayMovieCollection(int capacity) {
        movies = new String[capacity];
    }

    /**
     * Adds a movie to the collection.
     *
     * @param movie the name of the movie to add
     * @return the current ArrayMovieCollection instance for method chaining
     */
    public ArrayMovieCollection addMovie(String movie) {
        if (size < movies.length) {
            movies[size++] = movie;
        } else {
            System.out.println("Array is full!");
        }
        return this;
    }

    /**
     * Creates an iterator to traverse the movie collection.
     *
     * @return an Iterator instance for the movies array
     */
    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}
