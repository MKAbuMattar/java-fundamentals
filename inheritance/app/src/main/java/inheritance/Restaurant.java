package inheritance;

import category.types.LinkedList;


public class Restaurant extends Review {
  private String name;
  private double stars;
  private String RestaurantCategory;
  private static final LinkedList category = new LinkedList();

  /**
   *
   * @param name
   */
  public Restaurant(String name, String RestaurantCategory) {
    this.name = name;
    this.RestaurantCategory = RestaurantCategory;
  }

  /**
   *
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  public String getRestaurantCategory() {
    return RestaurantCategory;
  }

  public void setRestaurantCategory(String restaurantCategory) {
    RestaurantCategory = restaurantCategory;
  }

  /**
   *
   * @return
   */
  public double getStars() {
    this.stars = getReviewStars();
    return stars;
  }

  /**
   *
   * @return
   */
  public static LinkedList getCategory() {
    return category;
  }

  /**
   *
   * @param data
   * @param value
   */
  public static void setCategory(String data, double value) {
    category.add(data, value);
  }

  /**
   *
   * @return
   */
  public String toString(){
    return "Restaurant Name: " + getName() + " | Stars: " + getStars() + " | Restaurant Category: " + getRestaurantCategory() +  " | Menu: " + category + " Review: " + getReview();
  }
}
