package Abstract;

public abstract class VehiclePrint {
	public String getFuelType()
	{
		return "Gas";
	}
	
	@Override
	public String toString() 
	{
		String toString = "Num Seats: " +  getFuelType;
		return toString;
	}
}
