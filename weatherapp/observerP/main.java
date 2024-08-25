package weatherapp.observerP;



public class main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		 CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		 forecastDisplay forecastDisplay=new forecastDisplay(weatherData);
		 tempGraph tempGraph=new tempGraph(weatherData);
		 weatherData.setMeasurements(80, 65, 30.4f);
		 weatherData.setMeasurements(82, 70, 29.2f);
		 weatherData.setMeasurements(78, 90, 29.2f);
		 weatherData.setMeasurements(79, 68, 21.2f);

	}

}
