package weatherapp.observerP;

public class CurrentConditionsDisplay implements Observer,DisplayElements {
	private float temperature;
	private float humidity;
	private Subject weatherdata;
	
	public CurrentConditionsDisplay(Subject weatherdata) {
		this.weatherdata=weatherdata;
		this.weatherdata.registerObserver(this);
	}
	public void update(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		display();
	}
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + "humidity " + humidity);
	}
}
