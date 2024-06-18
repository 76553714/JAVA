package lab5;
public class Employee extends EmployeeException
{
	 int idNum;
	 int age;

	public Employee(int id,int age) 
	{
		if (errorcode==2)
		{
        System.out.print("This is Employee Class,Successfully to recieve valid data!");
		this.idNum=id;
		this.age=age;
		System.out.print("Successfully to store with ID :"+this.idNum+". And age :"+this.age);
		}
	}
	
	
	
}
