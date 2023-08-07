 package lab2q3;
 public class Identification 
 {
 	private String name;
 	private String email;
 	private char  gender;
 	
 	  public String getName () {return name;}
 	  public String getEmail () {return email;}
 	  public char getGender   () {return gender;}
 	  
 	    
		
   public Identification() {}
     public Identification(String name,String email,char gender) //initialize
      { 
 	    this.name=name;
 	     this.email=email;
 	      this.gender=gender;	    
       //testPrint  System.out.print(name+email+gender);
 	 }

     public void setEmail(String email) 
      {   //CHANGE EMAIL
      	this.email=email;
      } 

//    public static void main(String[] args) 
//    {
// 	 Identification person1 = new Identification("Noridayu","ayu@upm.edu.my",'f'); 
// 	 System.out.println(person1.toString(person1.getName(), person1.getGender(), person1.getEmail()));
//    }
   
     String toString(String name,char gender,String email) 
     {	   	return name+" ("+gender+") at "+email;} 
 }