package HomeAutomation.commandP;

public class Screen_Number {
	
	private boolean status=false;
	private int value;
	
	public Screen_Number(int value) {
		this.value=value;
	}
	public void on() {
		this.status=true;
	}
	public void off() {
		this.status=false;
	}
	public boolean isOn() {
		return this.status;
	}
	public int getValue() {
		if(this.isOn()) {
			return this.value;
		}
		else {
			return this.value*-1;
		}
	}

}
