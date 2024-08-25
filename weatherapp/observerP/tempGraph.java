package weatherapp.observerP;

public class tempGraph implements Observer,DisplayElements{
	private Subject weatherdata;
	private float temp;
	private int count;
	public tempGraph(Subject weatherdata) {
		this.weatherdata=weatherdata;
		this.weatherdata.registerObserver(this);
	}
	public void update(float arg1,float arg2,float arg3) {
		this.temp=this.weatherdata.getTemperature();
		this.count();
		display();
	}
	public void count() {
		this.count+=1;
	}
	public int getCount() {
		return this.count; 
	}
	public void display() {
		System.out.println(this.getCount()+". input=> Temperature:"+this.temp);
	}
	

}
