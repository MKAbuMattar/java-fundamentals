package inheritance;

public class Shop extends Review {
  private String name;
  private String description;
  private String numberOfDollarSigns;
  private double stars;


  public Shop(String name, String numberOfDollarSigns) {
    this.name = name;
    this.numberOfDollarSigns = numberOfDollarSigns;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getNumberOfDollarSigns() {
    return numberOfDollarSigns;
  }

  public void setNumberOfDollarSigns(String numberOfDollarSigns) {
    this.numberOfDollarSigns = numberOfDollarSigns;
  }

  public double getStars() {
    this.stars = getReviewStars();
    return stars;
  }

  public String toString(){
    return "Shop Name: " + getName() + " | Stars: " + getStars() + " | Shop Category: " + getNumberOfDollarSigns() +  " | Review: " + getReview();
  }
}
