package Assignment4.Visitor;


/**
 * The Visitor interface defines methods for visiting different types of files.
 * Concrete visitors will implement specific operations on these files.
 */
public interface Visitor {
    /**
     * Visit and perform an operation on a text file.
     *
     * @param textFile the text file to be visited
     */
    void visit(TextFile textFile);

    /**
     * Visit and perform an operation on an executable file.
     *
     * @param executableFile the executable file to be visited
     */
    void visit(ExecutableFile executableFile);

}
