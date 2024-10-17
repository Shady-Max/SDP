package Assignment4.Visitor;

/**
 * The File interface represents a generic file in the system.
 * It provides a method for accepting a visitor, enabling operations
 * to be performed on different types of files without modifying their classes.
 */
public interface File {

    /**
     * Accepts a visitor that can perform operations on this file.
     *
     * @param visitor The visitor that will perform operations on this file.
     */
    void accept(Visitor visitor);

}
