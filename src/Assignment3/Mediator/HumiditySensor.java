package Assignment3.Mediator;

/**
 * Humidity sensor class that sends humidity data to the mediator.
 */
public class HumiditySensor implements Sensor{

    private HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "30%";
        System.out.println("HumiditySensor: sending data - " + data);
        mediator.collectData(data, this);
    }

}
