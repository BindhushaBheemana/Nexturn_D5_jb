/**class Privatex{
    private int x = 4531;
    void showCode(){
        System.out.println(x);
    }
}**/
/**  class Defaultx{
    int num=4531;
}*/
import java.util.*;
public class day2{
   
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    /*  final double RUNNING_CALORIES = 10; // calories burned per minute while running
     final double SWIMMING_CALORIES = 8; // calories burned per minute while swimming
     final double CYCLING_CALORIES = 6; // calories burned per minute while cycling
     
     // Variable to store total calories burned
     double totalCalories = 0;

     // Variable for the activity and duration
     String activity;
     int duration;
     
     // Input loop to ask for multiple activities
     while (true) {
         // Ask for the activity
         System.out.print("Enter activity (running, swimming, cycling) or 'exit' to stop: ");
         activity = sc.nextLine().toLowerCase();
         
         if (activity.equals("exit")) {
             break; 
         }
         System.out.print("Enter the duration (in minutes): ");
         duration = sc.nextInt();
         sc.nextLine(); 
         double caloriesBurned = 0;
         int minutes = 0;
         while (minutes < duration) {
             if (activity.equals("running")) {
                 caloriesBurned += RUNNING_CALORIES;
             } else if (activity.equals("swimming")) {
                 caloriesBurned += SWIMMING_CALORIES;
             } else if (activity.equals("cycling")) {
                 caloriesBurned += CYCLING_CALORIES;
             } else {
                 System.out.println("Invalid activity entered. Please try again.");
                 caloriesBurned = 0;
                 break;
             }
             minutes++;
         }
         totalCalories += caloriesBurned;
         if (caloriesBurned > 0) {
             System.out.println("Calories burned for " + activity + ": " + caloriesBurned);
         }
     }
     System.out.println("Total calories burned: " + totalCalories);
     sc.close();*/
     System.out.println("Enter Marks:");
    int marks=sc.nextInt();
    switch(marks/10) {
        case 10:
        case 9:
            System.out.println("Grade A");
            break;
        case 8:
            System.out.println("Grade B");
            break;
        case 7:
            System.out.println("Grade C");
            break;
        case 6:
            System.out.println("Grade D");
            break;
        default:
            System.out.println("Fail");
    }
    for(int i=1;i<4;i++){
        for(int j=1;j<4;j++){
            System.out.println(i+" "+j);
        }
    }
    }

}

