package lab3q1;

public class StudentTester {

	public static void main(String[] args) 
	{

	    Student YYK = new Student(2097,"Kali","2097@students.upm.my",8.0);
	    Postgraduate professorLee = new Postgraduate(309999,"Mr.LeeMF",9.0,"How to be a professor","Lee@professor.upm.my");
	    
	    Undergraduate Kali=new Undergraduate();//use another way to initial
		 Kali.setmatric(101485);
		 Kali.setname("QG.Kali");
		 Kali.setgpa(5.5);
		 Kali.setlevel("Freshman");
		 Kali.setemail("Kali@gmail.com");
		
	    System.out.println("\n\n"  + YYK.toString());
	    System.out.println("\n\n" + Kali.toString());
        System.out.println("\n\n" +professorLee.toString());
	}
	
	

}
