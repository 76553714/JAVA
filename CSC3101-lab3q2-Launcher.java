package lab3q2;

public class Lab3q2Launcher {

	public static void main(String[] args) 
	{
		Essay tester = new Essay(23,19,15,30);
		System.out.println("Strat Testing mode1");
         System.out.println("Total score:"+tester.getScore ());
         System.out.println("Grade:"+tester.getGrade ());
         
        System.out.println("\n\nStrat Testing mode2");
        Essay tester2=new Essay();
        tester2.setScore(50);
        System.out.println("Successfully to set Score of tester2 with 50");
        System.out.println("Grade:"+tester2.getGrade());
	}

}
