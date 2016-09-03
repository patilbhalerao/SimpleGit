package Methodoverloading;

public interface Interface {
	
	//static final String car="XUV W10 AT";
	
	public default void display(String car) {
		
		System.out.println("Car Name :"  + car);
	}
	
		
}
