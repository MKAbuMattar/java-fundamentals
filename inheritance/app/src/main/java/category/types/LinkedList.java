package category.types;

import category.data.Node;

public class LinkedList {
  private Node head;

  public void add(String data, double value){
    Node node = new Node (data, value);
    if(head == null) {
      head = node;
      return;
    }
    Node current = this.head;
    while (current.getNext() != null){
      current = current.getNext();
    }
    current.setNext(node);
  }

  public String toString(){
    Node current = this.head;
    if (current == null) {
      return "category list is empty";
    }
    StringBuilder showList = new StringBuilder();
    showList.append("{ ");
    while(current != null){
      showList.append(" Name: ").append(current.getData()).append(" | Price: ").append(current.getValue()).append(" || ");
      current = current.getNext();
    }
    showList.append(" }");
    return showList.toString();
  }
}
