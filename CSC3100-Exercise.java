package lab;
//import java.util.Scanner;
import java.io.*;
public class Exercise
{	public static void main(String[] args) throws Exception 
  {
	int[][] array = {{2, 1}, {4, 3}, {7, 6}};
	 for (int i = array.length - 1; i >= 0; i--) 
	 {
	 	for (int j = array[i].length - 1; j >= 0; j--)
	 	System.out.print(array[i][j] + " ");
	 	System.out.println();
	 }
	 
	
	
}
}
