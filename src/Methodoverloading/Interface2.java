package Methodoverloading;

public class Interface2 implements Interface,Interface1 {
	
	/*public void display(String car)
	{
		System.out.println("Car NAme:" + car);
	}
	public void display(String company)
	{
		System.out.println("From Company"  + company);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface2 obj=new Interface2();
		Interface2 obj1=new Interface2();
	 
		obj.display("XUV W10 AT");
		obj1.display1("From Mahindra ");
		
	}

	@Override
	public void display(String car) {
		// TODO Auto-generated method stub
		Interface.super.display(car);
	}

}
