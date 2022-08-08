public class VacationPlanningApp {
    public static void main(String[] args) {
        Vacation newVacation = new Vacation(); 
    }
    
}

class Date {
    int month;
    int year;
    int day; 
}

class Vacation {
    Date startDate; 
    Date endDate; 
    People[] tourists;
    String[] visas; 
    String[] language; 
    Flight[] flights; 
    String[] luggage; 
    CarRental[] rentalCars; 
    Lodge[] lodges; 
    Campsite[] campsites; 
    DaySchedule[] days; 
    double finalBudget; 
    public Vacation() {
        System.out.println("I'm in Vacation's constructor");
    }
    public double grandCost() {
        double finalCost = 0;
        for (Lodge h: this.lodges) {
            finalCost = finalCost + h.CalculateTotalCost(); 
        }
        for (Flight f: this.flights) {
            finalCost = finalCost + f.cost; 
        }
        for (CarRental r: this.rentalCars) {
            finalCost = finalCost + r.totalcost(30); 
        }
        for (DaySchedule s: this.days) {
            finalCost = finalCost + s.totalCost;
        }
        return finalCost; 
    }
}

class People {
    String name; 
    int age; 

    public String persontype() {
        if (age < 18) {
            return "Children"; 
        }
        return "Adult"; 
    }
}

enum Weathertype {
    SUNNY, RAINY, CLOUDY, THUNDERSTORM, PARTLYCLOUDY
}

class Weather {
    Weathertype weather; 
    double temperature; 
}

class Flight {
    String departureAirport; 
    String arrivalAirport; 
    String departureAirportAddress; 
    String arrivalAirportAddress; 
    String flightNo; 
    Time departureTime; 
    Time arrivalTime; 
    Double cost;
    CustomerReview review; 
}

class Time {
    int hours;
    int minutes;
    int seconds; 
}

enum CarType {
    FIVEPEOPLE, SEVENPEOPLE, SUV 
}

class CarRental {
    String company; 
    Date pickupDate; 
    Date dropoffDate; 
    CarType size; 
    double rate; 
    CustomerReview review; 

    public double totalcost(double gascost) {
        int days = dropoffDate.day - pickupDate.day; 
        return this.rate * days + gascost; 
    }

}

enum RoomType {
    ONEBED, TWOBEDS, ONELARGEBED, SUITE
}
class Lodge {
    double rate; 
    String address; 
    Date checkinDate;
    Date checkoutDate; 
    int numOfDays; 
    CustomerReview review; 
    public double CalculateTotalCost() {
        return this.rate * this.numOfDays; 
    }
    
}

class Hotel extends Lodge{
    int numOfRooms;
    boolean swimmingPool; 
    boolean hasBreakfast; 
    RoomType roomType;
    String[] ammenities; 
}

class Campsite extends Lodge{
    boolean rvOrTent; 
}

class DaySchedule {
    String city; 
    Date date; 
    Destination[] destinations; 
    Restraunt Breakfast;
    Restraunt Lunch; 
    Restraunt Dinner; 
    Hotel hotel; 
    Double totalCost; 
    Weather currentWeather; 
    public double CalculateTotalCost(){
        for (Destination d: destinations) {
            this.totalCost = this.totalCost + d.totalCost; 
        }
        this.totalCost = this.totalCost + Breakfast.cost + Lunch.cost + Dinner.cost; 
        return this.totalCost; 
    }
    
}

class Restraunt {
    String name; 
    String address; 
    String[] menu; 
    int cost; 
    People[] people; 
    CustomerReview review; 

}

class Destination {
    String name; 
    Attraction[] attractions; 
    CustomerReview review; 
    Recommendation recommendations; 
    double totalCost;
    public double CalculateTotalCost(){
        for (Attraction a: attractions) {
            this.totalCost = this.totalCost + a.totalCost; 
        }
        return this.totalCost; 
    }
}

class Attraction {
    String name; 
    People[] peoplegoing; 
    Time times; 
    Time openTime;
    Time closeTime; 
    Activites[] activities; 
    String address; 
    Time waitingtimes; 
    String link; 
    CustomerReview review; 
    Double totalCost; 
    Recommendation recommendations; 
    public double CalculateTotalCost(){
        for (Activites a: activities) {
            this.totalCost = this.totalCost + a.cost; 
        }
        return this.totalCost; 
    }
}

class Activites {
    String name; 
    Double cost; 
    String place; 
    Recommendation recommendations; 
}

class Recommendation {
    String[] recommendedItems; 
    int[] recommendedAgeRange; 
    boolean suitableForDisabled; 
    boolean suitableForKids; 
    Time recommendedTime; 
}

class CustomerReview {
    int rating; 
    String review; 
}