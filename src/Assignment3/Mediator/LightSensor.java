package Assignment3.Mediator;

/**
 * Light sensor class that sends light data to the mediator.
 */
public class LightSensor implements Sensor{
    private HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "100 lux";
        System.out.println("LightSensor: sending data - " + data);
        mediator.collectData(data, this);
    }
}
