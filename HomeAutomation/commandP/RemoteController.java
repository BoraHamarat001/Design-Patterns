package HomeAutomation.commandP;

public class RemoteController {
	Command on;
	Command off;
	Command dayMode;
	Command nightMode;
	Command up;
	Command down;
	public RemoteController(Command on,Command off,Command dayMode,Command nightMode,Command up,Command down) {
		this.on=on;
		this.off=off;
		this.dayMode=dayMode;
		this.nightMode=nightMode;
		this.up=up;
		this.down=down;
	}
	public void clickOn() {
		this.on.execute();
	}
	public void clickOff() {
		this.off.unexecute();
	}
	public void dayModeOn() {
		this.dayMode.unexecute();
	}
	public void nightModeOn() {
		this.nightMode.execute();
	}
	public void powerUp() {
		this.up.execute();
	}
	public void powerDown() {
		this.down.unexecute();
	}

}
