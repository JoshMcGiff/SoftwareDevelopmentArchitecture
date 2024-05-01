public class TrafficLightControl {

    // this is just a way to simulate a traffic light system, there's nothing too bad here!
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 10; i++) {
            trafficLight.change();
            try {
                Thread.sleep(10000); // Pause to simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}