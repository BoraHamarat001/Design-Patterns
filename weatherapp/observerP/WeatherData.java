package weatherapp.observerP;

import java.util.ArrayList;
public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;
	private ArrayList observers;
	
	public WeatherData() {
		observers=new ArrayList();
	}
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}
	public void notifyObserver() {
		for (int i = 0; i < this.observers.size(); i++) {
			Observer observer=(Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		notifyObserver();
	}
	@Override
	public float getTemperature() {
		return this.temperature;
	}

}
