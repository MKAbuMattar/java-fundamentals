package category.data;

public class Node {

  private Node next;
  private final String data;
  private final double value;

  /**
   *
   * @param data
   * @param value
   */
  public Node(String data, double value) {
    this.data = data;
    this.value = value;
  }

  /**
   *
   * @return
   */
  public String getData() {
    return data;
  }

  /**
   *
   * @return
   */
  public double getValue() {
    return value;
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
