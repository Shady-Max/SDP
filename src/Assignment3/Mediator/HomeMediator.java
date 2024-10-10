package Assignment3.Mediator;

/**
 * Mediator interface for collecting data from various sensors
 * and generating reports.
 */
public interface HomeMediator {
    /**
     * Collects data from the sensors and stores it.
     *
     * @param data  The data collected by the sensor.
     * @param sensor The sensor that provided the data.
     */
    void collectData(String data, Sensor sensor);

    /**
     * Prints the final report containing data from all sensors.
     */
    void printReport();

}
