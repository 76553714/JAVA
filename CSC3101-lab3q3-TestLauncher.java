package lab3q3;

public class TestLauncher {

	public static void main(String[] args) 
	{
		Manager YYK = new Manager("Joy "," HUABEI F306","18790999490","209796@mail.com","CSC3101",900,1777) ;
		Manager CXY = new Manager("CAI XUKUN","Russian West K7","15225111954","34068@xx.ru","CSC3100",888,485);
		SalesPerson Tom = new SalesPerson("BigTom","Germany East B3","15039310786","S887s@germany.ge","CSC8888",111,555.5);
        
		System.out.println("\n"+YYK.toString());
		System.out.println("\n"+Tom.toString());
		System.out.print("\n"+CXY.showallowance());
	}

}
