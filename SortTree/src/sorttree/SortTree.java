package sorttree;

import bintree.BinNode;

public class SortTree<T> {

  protected final BinNode tree;

  public SortTree(T value) {
    if(value instanceof Comparable == false) throw new IllegalArgumentException();
    tree = new BinNode<T>(value);
  }
  public BinNode getTree() {
    return tree;
  }

  public void add(Comparable value) {

    BinNode currentNode = tree;

    while(currentNode.compareTo(value) > 0 && currentNode.hasLeft() ||
        currentNode.compareTo(value) <= 0 && currentNode.hasRight()) {
      if(tree.compareTo(value) > 0)
        currentNode = currentNode.getLeft();
      else
        currentNode = currentNode.getRight();
    }
    if(currentNode.compareTo(value) > 0) {
      currentNode.setLeft(new BinNode(value));
    } else {
      currentNode.setRight(new BinNode(value));
    }
  }

  public boolean exist(Comparable value) {
    BinNode currentNode = tree;
    while(currentNode != null) {
      if(currentNode.getValue().equals(value))
        return true;
      if(currentNode.compareTo(value) > 0)
        currentNode = currentNode.getLeft();
      else
        currentNode = currentNode.getRight();
    }
    return false;
  }
}
