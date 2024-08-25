package HomeAutomation.commandP;

public class Light {
	private boolean status;
	private String color="White";
	public int brightness=3;
	public void on() {
		this.status=true;
		this.message();
	}
	public void off() {
		this.status=false;
		this.message();
	}
	public boolean isOn() {
		return this.status;
	}
	public void setColor(String color) {
		this.color=color;
		System.out.println("Color of light is changed to "+color);
	}
	public String getColor() {
		return this.color;
	}
	public void message() {
		if(isOn()) {
			System.out.println("Light with "+this.getColor()+" color is turned on");
		}
		else {
			System.out.println("Light with "+this.getColor()+" color is turned off");
		}
	}
	public void upBrightnessLevel() {
		if(this.brightness<3) 
		{
			this.brightness++;
			this.brightnessMessage();
		}
		else {
			System.out.println("Level of brightness is highest!");
		}
	}
	public void downBrightnessLevel() {
		if(this.brightness>1) {
			this.brightness--;
			this.brightnessMessage();
		} else {
			System.out.println("Level of brightness is minimal!");
		}
	}
	private void brightnessMessage() {
	     switch(this.brightness) {
	    	 case 1: System.out.println("Light is now so faint"); break;
	    	 case 2: System.out.println("Light is now stabil"); break;
	    	 case 3: System.out.println("Light is now so shiny"); break;
	     }
	}

}
