package Methodoverloading;

public class Inheritence extends Tyre {
	
	public void carname(String C,String D)
	{
		System.out.println("Car A :" + C + A);
		System.out.println("Car B :" + D + B );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritence obj=new Inheritence();
		
		obj.carname("Scoda","Mercidise");
		obj.car("Bridgstone","MRF");
	}

}
