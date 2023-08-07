package lab3q3;

public class Secretary extends Employee
{
 Secretary(){}
 Secretary(String name,String add,String phone,String mail,String num,double salary)
 {this.name=name;this.address=add;this.phone=phone;this.mail=mail;this.number=num;this.basicsalary=salary;}
 
 void setname   (String name) {this.name=name  ;}
 void setaddress(String add)  {this.address=add;}
  void setphone  (String phone)   {this.phone=phone;}
   void setmail   (String mail) {this.mail=mail  ;}

String getname() {return this.name;}
 String getaddress(){return this.address;}
  String getphone(){return this.getphone();}
   String getmail() {return this.mail;}
}
