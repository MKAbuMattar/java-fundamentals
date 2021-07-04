package review.data;

public class Node {

  private Node next;
  private final String body;
  private final String author;
  private final double stars;

  public Node(String body, String author, double stars) {
    this.body = body;
    this.author = author;
    this.stars = stars;
  }

  public String getBody() {
    return body;
  }

  public String getAuthor() {
    return author;
  }

  public double getStars() {
    return stars;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
