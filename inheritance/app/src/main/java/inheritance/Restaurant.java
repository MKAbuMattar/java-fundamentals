package inheritance;

import category.types.LinkedList;

public class Restaurant extends Review {
  private String name;
  private double stars;
  private static final LinkedList category = new LinkedList();

  public Restaurant(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getStars() {
    this.stars = getReviewStars();
    return stars;
  }

  public static LinkedList getCategory() {
    return category;
  }

  public static void setCategory(String data, double value) {
    category.add(data, value);
  }

  public String toString(){
    return "Restaurant Name: " + getName() + " | Stars: " + getStars() + " | Category: " + category + " Review: " + getReview();
  }
}
