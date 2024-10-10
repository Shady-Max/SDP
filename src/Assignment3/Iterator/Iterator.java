package Assignment3.Iterator;

/**
 * A generic Iterator interface for traversing collections.
 *
 * @param <T> the type of elements returned by this iterator
 */
public interface Iterator<T> {
    /**
     * Checks if there are more elements to iterate over.
     *
     * @return true if more elements are available, false otherwise
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element of type T
     * @throws java.util.NoSuchElementException if no more elements are available
     */
    T next();
}
