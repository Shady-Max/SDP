package Assignment3.Memento;

/**
 * The Caretaker class is responsible for storing and retrieving
 * the memento of a TextEditor. It maintains a reference to the
 * TextMemento object, which holds the state of the editor.
 */
public class Caretaker {

    private TextMemento memento;

    /**
     * Saves the current state of the provided TextEditor.
     *
     * @param editor The TextEditor whose state is to be saved.
     */
    public void save(TextEditor editor) {
        memento = editor.save();
    }

    /**
     * Restores the TextEditor's state to the last saved memento.
     *
     * @param editor The TextEditor whose state is to be restored.
     */
    public void restore(TextEditor editor) {
        if (memento != null) {
            editor.restore(memento);
        } else {
            System.out.println("No saved states!");
        }
    }

}
