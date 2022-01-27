package Interface;

public class Bus implements Vehicle extends VehiclePrint{
	@Override
	public Integer getNumSeats() {
		return 30;
	}

	@Override
	public Integer getNumWheels() {
		return 8;
	}

	@Override	
	public String getFuelType()
	{
		return "Diesel";
	}	
	
}