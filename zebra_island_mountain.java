import java.util.*;

public class OceanActivities {
 
 // The OceanActivities class is a customized tour company specializing in activities based on the ocean, such as snorkeling and kayaking
 
 // Class attributes 
 private static String companyName;
 private static double pricePerActivity;
 private static int capacity;
 private static List<String> activities;
 
 // Constructor
 public OceanActivities(String name, double price, int cap, List<String> acts){
     companyName = name;
     pricePerActivity = price;
     capacity = cap;
     activities = acts; 
 }
 
 // Getter method for company name 
 public static String getCompanyName(){
     return companyName;
 }
 
 // Getter method for price per activity
 public static double getPricePerActivity(){
     return pricePerActivity;
 }
 
 // Getter method for capacity
 public static int getCapacity(){
     return capacity;
 }
 
 // Getter method for activities
 public static List<String> getActivities(){
     return activities;
 }
 
 // Method that prints out activities offered
 public static void listActivities(){
     for (String act : activities){
         System.out.println(act);
     }
 }
 
 // Method that calculates the total price for a customer booking one of the activities 
 public static double calculateTotalPrice(int numActivities){
     return numActivities*pricePerActivity;
 }
 
 // Method that reserves activities for a customer 
 public static void bookActivity(String activityName){
     if (activities.contains(activityName)){
         int index = activities.indexOf(activityName);
         System.out.println("You have successfully booked the " + activityName + " activity!");
     }
     else{
         System.out.println("Sorry, the activity you requested is not available!");
     }
 }
 
 // Method that checks if the company is at capacity 
 public static boolean checkCapacity(){
     return capacity > 0;
 }
 
 // Method that decrements the capacity when a customer reserves an activity
 public static void decrementCapacity(){
     capacity--;
 }
 
 // Main method
 public static void main(String[] args){
     // Create and initialize a list of activities 
     List<String> activitiesList = new ArrayList<>();
     activitiesList.add("Snorkeling");
     activitiesList.add("Kayaking");
     activitiesList.add("Surfing");
 
     // Create an instance of the OceanActivities class
     OceanActivities oceanActivities = new OceanActivities("Ocean Adventures", 50.99, 10, activitiesList);
     
     // Print out the activities 
     System.out.println("Welcome to " + OceanActivities.getCompanyName() + "!");
     System.out.println("We offer the following activities:");
     oceanActivities.listActivities();
     
     // Book an activity 
     oceanActivities.bookActivity("Surfing");
     
     // Check capacity
     if (oceanActivities.checkCapacity()){
         System.out.println("The company is still accepting customers!");
         oceanActivities.decrementCapacity();
     }
     else{
         System.out.println("Sorry, the company is at capacity!");
     }
     
     // Calculate the total price 
     int numActivities = 3;
     double totalPrice = oceanActivities.calculateTotalPrice(numActivities);
     System.out.println("The total price for " + numActivities + " activities will be " + totalPrice + ".");
 }
}