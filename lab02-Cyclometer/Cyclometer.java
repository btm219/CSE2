//Ben Meyerson
//September 3, 2015
//CSE 2 lab 2
//The purpose of this program is to print information and data that a cyclometer measures

public class Cyclometer{
    public static void main(String [] args){
        int secsTrip1 = 480; //time in seconds of the first trip
        int secsTrip2 = 3220; //time in seconds of the second trip
        int countsTrip1 = 1561; //number of counts for the first trip
        int countsTrip2 = 9037; //number of counts for the second trip
        double wheelDiameter = 27.0,
        PI = 3.14159, //
        feetPerMile = 5280, //conversion from feet to miles
        inchesPerFoot = 12, //conversion from inches to feet
        secondsPerMinute = 60; //conversion from seconds to minutes
        double distanceTrip1, distanceTrip2, totalDistance;
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //prints distance of trip 1 in miles
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); //prints distance of trip 2 in miles
        System.out.println("The total distance was "+totalDistance+" miles"); //prints total distance from both trips together
    
    }
}