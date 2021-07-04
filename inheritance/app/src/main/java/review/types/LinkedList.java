package review.types;

import review.data.Node;

public class LinkedList {
  private Node head;

  /**
   *
   * @param body
   * @param author
   * @param stars
   */
  public void add(String body, String author, int stars) {
    Node current = this.head;

    boolean isReview = false;

    while(current != null){
      if (current.getAuthor().equals(author)) {
        isReview = true;
        break;
      }
      current = current.getNext();
    }

    Node node = new Node(body, author, stars);

    if (!isReview){
      if(head == null) {
        head = node;
        return;
      }
      current = this.head;
      while (current.getNext() != null){
        current = current.getNext();
      }
      current.setNext(node);
    }

  }

  /**
   *
   * @return
   */
  public double avgStars() {
    Node current = this.head;
    if (current == null) {
      return 0.0;
    }
    double avg = 0.0;
    double cont = 0;
    while (current != null) {
      avg += current.getStars();
      cont++;
      current = current.getNext();
    }
    return avg / cont;
  }

  /**
   *
   * @return
   */
  public String toString() {
    Node current = this.head;
    if (current == null) {
      return "review list is empty";
    }
    StringBuilder showList = new StringBuilder();
    showList.append("{ ");
    while (current != null) {
      showList.append("Author Name: ")
          .append(current.getAuthor())
          .append(" | Comment: ")
          .append(current.getBody())
          .append(" | Star: ")
          .append(current.getStars())
          .append(" || ");

      current = current.getNext();
    }
    showList.append(" }");
    return showList.toString();
  }
}
