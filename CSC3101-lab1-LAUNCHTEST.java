package lab1;

public class LAUNCHTEST {

//	public Lab3test() {}
	public static void main(String[] args) 
	{
	 LAUNCHTEST launcher = new LAUNCHTEST();	
	 staticlaunch(launcher);
	}
	
	public static void staticlaunch(LAUNCHTEST go) {go.dynamic();}
	
	public void dynamic() {System.out.println("OK");}
	

}
