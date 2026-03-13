package Interview;

public class Bike extends Vehicle{

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int vehicleID, int purchaseYear, String ownerName, String vehiclType, String registationNUmber,
			String fuelType, double purchasePrice) {
		super(vehicleID, purchaseYear, ownerName, vehiclType, registationNUmber, fuelType, purchasePrice);
		// TODO Auto-generated constructor stub
	}
	public double CalculateInsurance(double purchasePrice) {
		
		
		Double onepercent = purchasePrice/100;
		Double FivePercent = onepercent*5;
		return FivePercent;
	} 
	
	
	
}
