import java.util.TimerTask;

class BusStopDisplay extends TimerTask {
    private Bus bus;
    private String stopName;
    private int stopDistance; // The distance of this stop from the starting point

    public BusStopDisplay(Bus bus, String stopName, int stopDistance) {
        // find the error here!
        this.stopName = stopName;
        this.stopDistance = stopDistance;
    }

    @Override
    public void run() {
        int busDistance = bus.getDistance();
        int distanceToStop = Math.max(0, stopDistance - busDistance);
        System.out.println("Display at " + stopName + ": Bus is " + distanceToStop + " meters away.");
    }
}
