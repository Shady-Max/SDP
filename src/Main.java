import Assignment4.Observer.*;
import Assignment4.State.Player;
import Assignment4.Strategy.*;
import Assignment4.Template.*;
import Assignment4.Visitor.*;

public class Main {
    public static void main(String[] args) {
        //Observer

        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        newsPublisher.subscribe(smartphoneSubscriber);
        newsPublisher.subscribe(laptopSubscriber);
        newsPublisher.subscribe(tabletSubscriber);

        newsPublisher.publishNews("Sports", "Team loses the match!");
        newsPublisher.publishNews("Science", "New scientific breakthrough!");
        newsPublisher.publishNews("Politics", "The next Presidential elections will be soon!");

        System.out.println();

        //State

        Player player = new Player();

        player.play();
        player.pause();
        player.play();
        player.stop();
        player.pause();

        System.out.println();

        //Strategy

        Order order = new Order(1000);

        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Final amount with card payment: " + order.calculateFinalAmount());

        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Final amount with wallet payment: " + order.calculateFinalAmount());

        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Final amount with cash on delivery: " + order.calculateFinalAmount());

        System.out.println();

        //Template

        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Food product quality check:");
        foodCheck.checkProduct();

        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Electronics product quality check:");
        electronicsCheck.checkProduct();

        System.out.println();

        //Visitor

        File textFile = new TextFile("document.txt", "This is a clean document.");
        File bannedTextFile = new TextFile("bannedDocument.txt", "banned");
        File executableFile = new ExecutableFile("program.exe", "safe_code");
        File malvareExecutableFile = new ExecutableFile("suspiciousProgram.exe", "malware");

        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        System.out.println("Antivirus check:");
        textFile.accept(antivirus);
        bannedTextFile.accept(antivirus);
        executableFile.accept(antivirus);
        malvareExecutableFile.accept(antivirus);

        System.out.println("\nGenerating report:");
        textFile.accept(report);
        executableFile.accept(report);

    }
}