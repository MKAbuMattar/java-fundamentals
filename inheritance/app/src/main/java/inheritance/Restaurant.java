package inheritance;

import category.types.LinkedList;


public class Restaurant extends Review {
  private String name;
  private double stars;
  private static final LinkedList category = new LinkedList();

  /**
   *
   * @param name
   */
  public Restaurant(String name) {
    this.name = name;
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
    return "Restaurant Name: " + getName() + " | Stars: " + getStars() + " | Category: " + category + " Review: " + getReview();
  }
}
