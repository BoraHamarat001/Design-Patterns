package operatingsystems.abstractfactoryP;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		MachineFactory linuxFactory=new LinuxMachineFactory();
		MachineFactory windowsFactory=new WindowsMachineFactory();
		MachineFactory macosFactory=new MacOSMachineFactory();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("What type of a machine you want? Linux=>Press 1 / Windows=>Press 2 / MacOS=>Press 3");
		int user_choice=sc.nextInt();
		if(user_choice==1) {
			System.out.println("Ubuntu=>Press 1 / RedHat=>Press 2");
			int user_distchoice=sc.nextInt();
			AWS_VMs vm1=new AWS_VMs(linuxFactory);
			if(user_distchoice==1) {
			vm1.rentVM("ubuntu");
			}
			else if(user_distchoice==2) {
				vm1.rentVM("redhat");
			}
		}
		else if(user_choice==2) {
			System.out.println("WindowsXP=>Press 1 / AutoPC=>Press 2");
			int user_distchoice=sc.nextInt();
			AWS_VMs vm1=new AWS_VMs(windowsFactory);
			if(user_distchoice==1) {
				vm1.rentVM("windowsxp");
			}
			else if(user_distchoice==2) {
				vm1.rentVM("autopc");
			}
		}*/
		AWS_VMs vm1=new AWS_VMs(linuxFactory);
		vm1.rentVM("redhat");

	}

}
