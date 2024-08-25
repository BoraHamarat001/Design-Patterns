package HomeAutomation.commandP;

public class main {

	public static void main(String[] args) {
		Light basementLight=new Light();
	    PowerCommand basementLightPowerOnOff=new PowerCommand(basementLight);
	    LightColorCommand lightColor=new LightColorCommand(basementLight);
	    BrightnessLevelCommand brightnessLevel=new BrightnessLevelCommand(basementLight);
	    RemoteController controller1=new RemoteController(basementLightPowerOnOff,basementLightPowerOnOff,lightColor,lightColor,brightnessLevel,brightnessLevel);
	    controller1.clickOn();
	    controller1.nightModeOn();
	    controller1.clickOff();
        controller1.powerDown();
        controller1.powerDown();
		/*Screen_Number screen_number_one=new Screen_Number(1);
		Screen_Number screen_number_two=new Screen_Number(2);
		Screen_Number screen_number_three=new Screen_Number(3);
		Screen_Number screen_number_four=new Screen_Number(4);
		Screen_Number screen_number_five=new Screen_Number(5);
		
		PressCommand number_one_press=new PressCommand(screen_number_one);
		ReleaseCommand number_one_release=new ReleaseCommand(screen_number_one);
		PressCommand number_two_press=new PressCommand(screen_number_two);
		ReleaseCommand number_two_release=new ReleaseCommand(screen_number_two);
		PressCommand number_three_press=new PressCommand(screen_number_three);
		ReleaseCommand number_three_release=new ReleaseCommand(screen_number_three);
		PressCommand number_four_press=new PressCommand(screen_number_four);
		ReleaseCommand number_four_release=new ReleaseCommand(screen_number_four);
		PressCommand number_five_press=new PressCommand(screen_number_five);
		ReleaseCommand number_five_release=new ReleaseCommand(screen_number_five);
        PressCommand[] partyOn= {number_one_press,number_two_press,number_three_press,number_four_press,number_five_press};
        ReleaseCommand[] partyOff= {number_one_release,number_two_release,number_three_release,number_four_release,number_five_release};
        MacroCommand partyOnMacro=new MacroCommand(partyOn);
        MacroCommand partyOffMacro=new MacroCommand(partyOff);
		Calculator calcultor=new Calculator();
		calcultor.setCommand(0, number_one_press, number_one_release);
		calcultor.setCommand(1, number_two_press, number_two_release);
		calcultor.setCommand(2, number_three_press, number_three_release);
		calcultor.setCommand(3, number_four_press, number_four_release);
		calcultor.setCommand(4, number_five_press, number_five_release);
		calcultor.setCommand(5, partyOnMacro, partyOffMacro);
		calcultor.clickOn(0);
		calcultor.clickOn(1);
		calcultor.clickOff(1);
		calcultor.clickOn(1);
		calcultor.clickOn(2);
		calcultor.clickOff(0);
		calcultor.clickUndo();
		calcultor.clickOn(3);
		calcultor.clickUndo();
		calcultor.clickOn(0);
		calcultor.clickOn(1);
		calcultor.clickOn(2);
		calcultor.clickUndo();
		calcultor.clickUndo();
		calcultor.clickUndo();*/
		
	}

}
