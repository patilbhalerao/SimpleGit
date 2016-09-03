package Methodoverloading;

public class Tyre {
	String name="XUV500";
	 static String A;
	 static String B;
	
	Tyre()
	{
		name="XUV500";
		System.out.println(name);
	}
	public void car(String A,String B)
	{
		System.out.println("Tyre1 :" + A);
		System.out.println("Tyre2 :"  + B);
	}
	
	public void car(int a)
	{
		System.out.println("Total Tyre :" + a );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tyre obj=new Tyre();
		
		obj.car("Bridgestone", "MRF");
		obj.car(4);

	}

}
