package day3;

enum Day {
 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Enum {
 public static void main(String[] args) {
     Day today = Day.FRIDAY;
     System.out.println("Today is: " + today);
     
     System.out.println("Days of the week:");
     for (Day day : Day.values()) {
         System.out.println(day);
     }
 }
}
