package Methodoverloading;

public class Abstract2 extends Abstract1 {
	
	public void display(String car,String car_type)
	{
		System.out.printf("Car name :" + car ,"Car Type :" + car_type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstract2 obj=new Abstract2();
		
		obj.display("XUV500","W10 AT");
		
		
	}

}
