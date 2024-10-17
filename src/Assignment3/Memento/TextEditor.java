package Assignment3.Memento;


/**
 * The TextEditor class allows modification of text and provides
 * functionality to save and restore its state using the Memento pattern.
 */
public class TextEditor {

    private StringBuilder currentText;

    public TextEditor() {
        currentText = new StringBuilder();
    }

    /**
     * Adds new text to the existing content.
     *
     * @param text The text to be appended.
     */
    public void addText(String text) {
        currentText.append(text);
    }

    /**
     * Displays the current content of the editor.
     */
    public void showText() {
        System.out.println("Current Text: " + currentText.toString());
    }

    /**
     * Saves the current state of the editor as a TextMemento.
     *
     * @return A new TextMemento containing the current text.
     */
    public TextMemento save() {
        return new TextMemento(currentText.toString());
    }

    /**
     * Restores the state of the editor from a given TextMemento.
     *
     * @param memento The TextMemento object that holds the saved state.
     */
    public void restore(TextMemento memento) {
        currentText = new StringBuilder(memento.getText());
    }

}
