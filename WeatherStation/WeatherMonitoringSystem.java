public class WeatherMonitoringSystem {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);

        weatherStation.setMeasurements(28.2f, 65f, 1013.1f);
        weatherStation.setMeasurements(22.9f, 70f, 997.0f);
        weatherStation.setMeasurements(27.6f, 90f, 1002.0f);
    }
}
