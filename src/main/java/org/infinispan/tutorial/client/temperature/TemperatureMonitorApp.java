package org.infinispan.tutorial.client.temperature;

import org.infinispan.tutorial.client.App;
import org.infinispan.tutorial.services.temperature.TemperatureMonitor;

/**
 * Monitors changes.
 * {@link TemperatureLoaderApp} needs to be running
 */
public class TemperatureMonitorApp extends App {

    @Override
    public void execute() throws Exception {
        TemperatureMonitor temperatureMonitor = new TemperatureMonitor(admin);

        Float temperature = temperatureMonitor.getTemperatureForLocation("Рустай");

        System.out.printf("Темпеература %s Рустай , Экоцентр\n", temperature);

        temperatureMonitor.monitorLocation("Рустай , Экоцентр");

        System.out.println("---- Press any key to quit ----");
        while(System.in.available() == 0) {
            // Do nothing
        }
    }

    public static void main(String[] args) {
        new TemperatureMonitorApp().run();
    }
}
