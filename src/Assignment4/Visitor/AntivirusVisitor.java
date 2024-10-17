package Assignment4.Visitor;

/**
 * Concrete implementation of the Visitor interface.
 * This visitor performs antivirus scanning on different types of files.
 */
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file: " + textFile.getName());
        if (textFile.getContent().contains("banned")) {
            System.out.println("Warning: Text file contains banned words!");
        } else {
            System.out.println("Text file is clean.");
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file: " + executableFile.getName());
        if (executableFile.getCode().contains("malware")) {
            System.out.println("Warning: Executable file contains malicious code!");
        } else {
            System.out.println("Executable file is clean.");
        }
    }
}
