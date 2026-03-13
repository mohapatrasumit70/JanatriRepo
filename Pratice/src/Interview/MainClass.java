package Interview;

import java.util.Comparator;

public class MainClass  {
	
		

	public static void main(String[] args) {
		Vehicle v = new Bike(1001,2026,"sumit","Bike","OD13WA7852","petrol",490000);
		Bike b = (Bike) v;
		System.out.println(b.CalculateInsurance(490000));
		
		Vehicle c1 = new Vehicle(1001,2026,"sumit","Bike","OD13WA7852","petrol",490000);
		

	}

	
	
	

}
