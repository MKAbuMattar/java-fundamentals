package review.data;

public class Node {

  private Node next;
  private final String body;
  private final String author;
  private final double stars;

  /**
   *
   * @param body
   * @param author
   * @param stars
   */
  public Node(String body, String author, double stars) {
    this.body = body;
    this.author = author;
    this.stars = stars;
  }

  /**
   *
   * @return
   */
  public String getBody() {
    return body;
  }

  /**
   *
   * @return
   */
  public String getAuthor() {
    return author;
  }

  /**
   *
   * @return
   */
  public double getStars() {
    return stars;
  }

  /**
   *
   * @return
   */
  public Node getNext() {
    return next;
  }

  /**
   *
   * @param next
   */
  public void setNext(Node next) {
    this.next = next;
  }
}
