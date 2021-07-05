/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import inheritance.Restaurant;
import inheritance.Shop;
import inheritance.Theater;

public class App {
  public static void main(String[] args) {

    Restaurant McDonaldson = new Restaurant("McDonaldson", "$$$");

    McDonaldson.setCategory("Big Mac",5.3);
    McDonaldson.setCategory("Chicken McNuggets",2.3);
    McDonaldson.setCategory("World Famous Fries",.99);

    McDonaldson.addReview("trash","mohammad",5);
    McDonaldson.addReview("trash","Ali",4);
    McDonaldson.addReview("trash","mohammad",4);

    System.out.println("Restaurant");
    System.out.println(McDonaldson);

    Shop mk = new Shop("MK", "$$$$$$");

    mk.addReview("good","mohammad",5);
    mk.addReview("good","khaled",5);
    mk.addReview("nice","Ali",3);
    mk.addReview("good","khaled",5);

    System.out.println("Shop");
    System.out.println(mk);

    Theater newTheater = new Theater("MK Theater");

    newTheater.addMovie("Movie1");
    newTheater.addMovie("Movie2");
    newTheater.addMovie("Movie3");
    newTheater.removeMovie("Movie2");

    newTheater.addReview("good","mohammad",5);
    newTheater.addReview("good","khaled",5);
    newTheater.addReview("nice","Ali",3);
    newTheater.addReview("good","khaled",5);

    System.out.println("Theater");
    System.out.println(newTheater);
  }
}
