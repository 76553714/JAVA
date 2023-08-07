package lab3q3;

public class Person 
{
	 String name;
	 String address;
	 String  phone ;
	 String mail;
	 
	 Person(){}
	 Person(String name,String add,String phone,String mail){this.name=name;this.address=add;this.phone=phone;this.mail=mail;}

     void setname   (String name) {this.name=name  ;}
      void setaddress(String add)  {this.address=add;}
       void setphone  (String phone)   {this.phone=phone;}
        void setmail   (String mail) {this.mail=mail  ;}
     
     String getname() {return this.name;}
      String getaddress(){return this.address;}
       String getphone(){return this.getphone();}
        String getmail() {return this.mail;}
        
}
