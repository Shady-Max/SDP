package Assignment3.Memento;

/**
 * The TextMemento class represents a snapshot of the TextEditor's state.
 * It stores the editor's text and provides access to it.
 */
public class TextMemento {

    private final String text;

    /**
     * Constructs a TextMemento with the provided text.
     *
     * @param text The text to save as a memento.
     */
    public TextMemento(String text) {
        this.text = text;
    }

    /**
     * Retrieves the stored text from the memento.
     *
     * @return The saved text.
     */
    public String getText() {
        return text;
    }

}
