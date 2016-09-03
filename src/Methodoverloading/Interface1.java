package Methodoverloading;

public interface Interface1 {
	//static final String company="Mahindra";
	
public default void display1(String company)

{
	System.out.println("From Company :" + company);
}
}
