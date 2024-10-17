package Assignment4.Visitor;

/**
 * Represents an executable file in the system.
 * It holds executable code and allows a visitor to perform operations on it.
 */
public class ExecutableFile implements File{
    private String name;
    private String code;

    public ExecutableFile(String name, String code) {
        this.name = name;
        this.code = code;
    }

    /**
     * Returns the name of the executable file.
     * @return the name of the executable file.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the code of the executable file.
     * @return the code of the executable file.
     */
    public String getCode() {
        return code;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
