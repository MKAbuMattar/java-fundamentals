/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import inheritance.Restaurant;
import inheritance.Review;

public class App {
    public static void main(String[] args) {

        Restaurant McDonaldson = new Restaurant("McDonaldson");
        McDonaldson.setCategory("Big Mac",5.3);
        McDonaldson.setCategory("Chicken McNuggets",2.3);
        McDonaldson.setCategory("World Famous Fries",.99);

        McDonaldson.addReview("trash","mohammad",5);
        McDonaldson.addReview("trash","Ali",3);
        McDonaldson.addReview("trash","mohammad",4);

        System.out.println(McDonaldson);
    }
}
