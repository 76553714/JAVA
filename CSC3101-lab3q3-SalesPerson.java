package lab3q3;

public class SalesPerson extends Employee
{
	double commission;
  SalesPerson(){}
  SalesPerson(String name,String add,String phone,String mail,String num,double salary,double commission)
  {this.name=name;this.address=add;this.phone=phone;this.mail=mail;this.number=num;this.basicsalary=salary;this.commission=commission;}
  
  void   setcommission(double commission) {this.commission=commission;}
  double getcommission(          ) {return this.commission;}
  
  public String toString() {return "The SalesPerson "+this.name+" (employee number "+this.number+") has a salary of "+this.basicsalary;}
}
