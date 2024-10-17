package Assignment4.Visitor;

/**
 * Concrete implementation of the Visitor interface.
 * This visitor generates a report for different file types.
 */
public class ReportVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file: " + textFile.getName());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file: " + executableFile.getName());
    }

}
