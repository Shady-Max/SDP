package Assignment3.Mediator;

/**
 * Implementation of the HomeMediator interface.
 * Stores and manages data from different sensors.
 */
public class HomeMediatorImpl implements HomeMediator {
    private String temperatureData = "";
    private String humidityData = "";
    private String lightData = "";

    @Override
    public void collectData(String data, Sensor sensor) {
        if (sensor instanceof TemperatureSensor) {
            temperatureData = data;
        } else if (sensor instanceof HumiditySensor) {
            humidityData = data;
        } else if (sensor instanceof LightSensor) {
            lightData = data;
        }
    }

    @Override
    public void printReport() {
        System.out.println("Smart Home Report:");
        System.out.println("Temperature: " + temperatureData);
        System.out.println("Humidity: " + humidityData);
        System.out.println("Light: " + lightData);
    }
}
