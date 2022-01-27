package Interface;

public class Car implements Vehicle extends VehiclePrint{
	@Override
	public Integer getNumSeats() {
		return 5;
	}

	@Override
	public Integer getNumWheels() {
		return 4;
	}
	
	
}
