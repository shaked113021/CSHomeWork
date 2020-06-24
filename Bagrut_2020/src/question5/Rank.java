package question5;

import unit4.collectionsLib.Node;

public class Rank {

  private Node<Competitor> competitors = null;

  public void add(Competitor x) {
    if(competitors == null) {
      competitors = new Node<Competitor>(x);
      return;
    }


    if((competitors.getValue().getMinuets() * 60 + competitors.getValue().getSeconds()) >
        (x.getMinuets() * 60 + x.getSeconds())) {
      competitors = new Node<Competitor>(x, competitors);
      return;
    }

    Node<Competitor> currNode = competitors;

    while(currNode.getNext() != null) {
      Competitor temp = currNode.getNext().getValue();
      if((temp.getMinuets() * 60 + temp.getSeconds()) > (x.getMinuets() * 60 + x.getSeconds())) {
        currNode.setNext(new Node<Competitor>(x, currNode.getNext()));
        return;
      }
      currNode = currNode.getNext();
    }

    currNode.setNext(new Node<Competitor>(x));
  }

  public String rank(int x) {

    int i = 1;
    Node<Competitor> currNode = competitors;

    while(currNode != null) {
      if(i == x) return currNode.getValue().getName();
      i++;
      currNode = currNode.getNext();
    }
    return "not found";
  }

}
