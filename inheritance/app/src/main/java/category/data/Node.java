package category.data;

public class Node {

  private Node next;
  private final String data;
  private final double value;

  public Node(String data, double value) {
    this.data = data;
    this.value = value;
  }

  public String getData() {
    return data;
  }

  public double getValue() {
    return value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

}
