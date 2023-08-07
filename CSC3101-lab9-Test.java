package ·ºÐÍ;

public class Test 
{
	public static void main(String[] args) 
	{
		Dao d1 = new MenuDao();
		Dao d2=new UserDao();
		
		Menu m = new Menu();
		d1.add(m);
		d1.del(m);
		d1.update(m);
		d1.getByID();
	}
}
