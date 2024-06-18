package Lab8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
public class lab8q1 //this is lab8q1 by joy
{
	public static void main(String[] args) 
	{	
		try{
			File dat = new File("src/Lab8/Lab8.dat");

			if(!dat.exists()) 
			{
				System.out.println("Can not run because there is no dat file!But don't worry:JOY has made for u.");
				if(dat.createNewFile()==false)
				{
					System.out.println("Can not creat file,Please check your floder's permission");
					System.exit(0);
				}
			}

			else 
			{
				System.out.println("OK!Now Start normally run!Welcome!");
			}

			//FileInputStream rddat=new FileInputStream(new File("src/Lab8/Lab8.dat"));
			FileOutputStream wrdat=new FileOutputStream(new File("src/Lab8/Lab8.dat"),true);
			for(int i=0;i<150;i++) 
			{
				Random rd= new Random();
				int tempNum = rd.nextInt();
				wrdat.write(String.valueOf(tempNum).getBytes());
				wrdat.write("\n".getBytes());
				// (test output):System.out.println(String.valueOf(tempNum));
			}
			wrdat.flush();
			wrdat.close();
		}

		catch(IOException e) {System.out.println("Some error happened!Information are as follows:\n");e.printStackTrace();}	
		finally {System.out.println("End Successfully!");}
	}

}
