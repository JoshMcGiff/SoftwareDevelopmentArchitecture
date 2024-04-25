import java.util.Timer;

public class PollingBusSystem {
    public static void main(String[] args) {
        Bus bus = new Bus(0);
        Timer timer = new Timer();

        // Setting up displays for three stops
        // TimerTask has a function called run() that BusStopDisplay extends and implements, that checks for the bus' updates EVERY 5 seconds.
        // TODO: Add two more BusStopDisplays (3 in total) with a Destination of your choice and a stopDistance, i.e how far from the starting point.
        timer.scheduleAtFixedRate(new BusStopDisplay(bus, "Hurler's Bar", 500), 0, 5000);
        // eg: timer.scheduleAtFixedRate(new BusStopDisplay(bus, "somelocation", [someDistance]), 0, 5000);


        //TODO: There will be another error, can you fix it? (HINT: BusStopDisplay.java is missing something)

        // Simulate bus movement
        try {
            for (int i = 0; i < 6; i++) { // Simulate 6 updates every 5 seconds
                int currentDistance = bus.getDistance();
                bus.setDistance(currentDistance + 100); // Bus travels 100 meters every 5 seconds
                Thread.sleep(5000); // Delay to simulate time passing
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel(); // Stop the timer tasks when done
    }
}
