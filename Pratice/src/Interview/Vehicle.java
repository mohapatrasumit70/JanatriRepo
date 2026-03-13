package Interview;

public class Vehicle {
	private int vehicleID,purchaseYear;
	private String ownerName,vehiclType,registationNUmber,fuelType;
	private double purchasePrice;
	public Vehicle(int vehicleID, int purchaseYear, String ownerName, String vehiclType, String registationNUmber,
			String fuelType, double purchasePrice) {
		
		this.vehicleID = vehicleID;
		this.purchaseYear = purchaseYear;
		this.ownerName = ownerName;
		this.vehiclType = vehiclType;
		this.registationNUmber = registationNUmber;
		this.fuelType = fuelType;
		this.purchasePrice = purchasePrice;
	}
	public Vehicle() {
		super();
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public int getPurchaseYear() {
		return purchaseYear;
	}
	public void setPurchaseYear(int purchaseYear) {
		this.purchaseYear = purchaseYear;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getVehiclType() {
		return vehiclType;
	}
	public void setVehiclType(String vehiclType) {
		this.vehiclType = vehiclType;
	}
	public String getRegistationNUmber() {
		return registationNUmber;
	}
	public void setRegistationNUmber(String registationNUmber) {
		this.registationNUmber = registationNUmber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	
//	--------------------------
public void CalculateDespreciation() {
		
	}
public double CalculateRoadTax() {
	return 0;
} 

public double CalculateInsurance() {
	return 0;
} 

public int getVehicleAge() {
	return 0;
} 
public void DisplayVehicleInfo() {
	
} 
public void DisplayCostBreakup() {
	
} 
}

