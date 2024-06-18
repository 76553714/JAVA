package lab3q3;

public class Dependent extends Person
{
	char gender;
    String birthdate;
    
    Dependent(){}
    Dependent(String name,String add,String phone,String mail,char gender,String birthday)
    {this.name=name;this.address=add;this.phone=phone;this.mail=mail;this.gender=gender;this.birthdate=birthday;}
    
    void setgender   (char gender)     {this.gender=gender   ;  }
    void setbirthdate(String birthday) {this.birthdate=birthday;}
     
     char   getgender   () {return  this.gender ; }
     String getbirthdate() {return this.birthdate;}
}
