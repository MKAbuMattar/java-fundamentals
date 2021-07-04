package inheritance;

import review.types.LinkedList;

public class Review implements ReviewInterface{
  private String body;
  private String author;
  private int stars;

  private static final LinkedList review = new LinkedList();

  @Override
  public void addReview(String body, String author, int stars) {
    this.body = body;
    this.author = author;
    this.stars = stars;
    review.add(body, author, stars);
  }

  public LinkedList getReview() {
    return  review;
  }

  public double getReviewStars() {
    return review.avgStars();
  }

  @Override
  public String toString() {
    return getReview().toString();
  }
}
