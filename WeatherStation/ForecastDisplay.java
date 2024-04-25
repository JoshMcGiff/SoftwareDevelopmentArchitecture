class ForecastDisplay implements Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // TODO: Implement the update method for handling ride adjustments.
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}