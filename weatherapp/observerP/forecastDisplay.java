package weatherapp.observerP;

public class forecastDisplay implements Observer,DisplayElements {
	private float temperature;
	private boolean tempPos=false;
	private Subject weatherdata; 
	public forecastDisplay(Subject weatherdata) {
		this.weatherdata=weatherdata;
		this.weatherdata.registerObserver(this);
	}
	public void update(float temperature,float humidity,float pressure) {
		if(temperature>this.temperature) {
			tempPos=true;
		}else {
			tempPos=false;
		}
        this.temperature=temperature;
		display();
	}
	public void display() {
		if(tempPos) System.out.println("Tempreature is increasing");
		else System.out.println("Temperature is decreasing");
	}

}
