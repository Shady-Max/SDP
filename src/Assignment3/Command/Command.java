package Assignment3.Command;

/**
 * Command interface that all concrete command classes will implement.
 * This allows the encapsulation of a request as an object, which can
 * be executed later.
 */
public interface Command {
    /**
     * The method to execute the command.
     */
    void execute();

}
