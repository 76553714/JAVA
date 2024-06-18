package lab3q2;
//Superclass
public class GradeActivity {
	int  score;
	char grade;
	  
	public GradeActivity() {}
	    
	    char getGrade() 
	    {
	     if (this.score>=90)this.grade='A';
	     else if (this.score>=80&&this.score<90)this.grade='B';
	      else if(this.score>=70&& this.score<80)this.grade='C';
	       else if(this.score>=60&& this.score<70)this.grade='D';
	        else if (this.score<60)this.grade='F';
	         else this.grade='?';
	     return this.grade;
	    }
}


