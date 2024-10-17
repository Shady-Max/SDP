package Assignment4.Visitor;

/**
 * Represents a text file in the system.
 * It holds file content and allows a visitor to perform operations on it.
 */
public class TextFile implements File{
    private String name;
    private String content;

    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
    }

    /**
     * Returns the name of the text file.
     * @return the name of the text file.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the content of the text file.
     * @return the content of the text file.
     */
    public String getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
