import bintree.BinNode;
import sorttree.SortTree;

public class Main {

  public static void main(String... args) {
    SortTree sortTree = new SortTree(5);
    sortTree.add(3);
    sortTree.add(7);
    sortTree.add(2);
    sortTree.add(10);

    printTreeInOrder(sortTree.getTree());
  }

  public static void printTreeInOrder(BinNode<Integer> binNode) {
    if(binNode != null) {
      printTreeInOrder(binNode.getLeft());
      System.out.println(binNode.getValue());
      printTreeInOrder(binNode.getRight());
    }
  }
}
