package part3;
//Refuelable is an interface because none of its methods contain any implementation 
public interface Refuelable {
	
	public abstract void refuel();		//Refuels vehicles by incrementing a fuelLevel instance variable
	
	public abstract int getFuelLevel();	//Returns the fuelLevel of the vehicle 
}
