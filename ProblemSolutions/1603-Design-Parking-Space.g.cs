
public class ParkingSystem {
int bigLimit, mediumLimit, smallLimit;
int[] parkingArray;
       
    public ParkingSystem(int big, int medium, int small) {
        this.parkingArray = new int[3] { big, medium, small };
        }

    
    
    public bool AddCar(int carType) {
        if (carType == 1 && parkingArray[0] >= 1){
            parkingArray[0] = parkingArray[0] - 1;
            return true;
        } else if (carType == 2 && parkingArray[1] >= 1){
            parkingArray[1] = parkingArray[1] - 1;
            return true;
        } else if (carType == 3 && parkingArray[2] >= 1){
            parkingArray[2] = parkingArray[2] - 1;
            return true;
        } else { return false; }
       
        
    }

}
/* 1603. Design Parking System
Easy
1.6K
409
Companies
Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.

Implement the ParkingSystem class:

ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. The number of slots for each parking space are given as part of the constructor.
bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType. If there is no space available, return false, else park the car in that size space and return true.
 
  INTUITION: Once You Figure Out What They Want Its Quite Simple (Hint/Tip: If you want to better understand what they want pretend they are explaining it to you like they are a customer and have no idea how to code otherwise their silly Jargon and atrocious explanations will fog you up) after that you'll
 figure out all they really want is to fill a parking space when a car of that size parks there and boom its incredibly simple just create an array of the parking spaces and if the space exists remove it and return true if a car of the desired type can fit */
 
