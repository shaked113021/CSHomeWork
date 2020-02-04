package bintree;

/**
 * This is class Represents a node of a binary tree with a generic value type
 *
 * @author Shaked Cohen
 * @since 2020-2-4
 * @param <T> type of value
 */
public class BinNode<T> implements Comparable {

  private T value;
  private BinNode<T> left;
  private BinNode<T> right;

  /**
   * This constructor builds a Binary node with a value only.
   * left and right childs are null
   * @param value
   */
  public BinNode(T value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /**
   * this constructor creates a binary node with two childs
   * @param value
   * @param left
   * @param right
   */
  public BinNode(T value, BinNode<T> left, BinNode<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public T getValue() {
    return value;
  }

  /**
   * Checks if
   * @return if node is a leaf true, else false
   */
  public boolean isLeaf() {
    return (left == null && right == null);
  }

  /**
   * Checks if node has a left child
   * @return if left child exists true, else null
   */
  public boolean hasLeft() {
    return left != null;
  }

  /**
   * Checks if node has a right child
   * @return if right child exists true, else false
   */
  public boolean hasRight() {
    return right != null;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public BinNode<T> getLeft() {
    return left;
  }

  public void setLeft(BinNode<T> left) {
    this.left = left;
  }

  public BinNode<T> getRight() {
    return right;
  }

  public void setRight(BinNode<T> right) {
    this.right = right;
  }

  @Override
  public int compareTo(Object o) {
    if(((value instanceof Comparable) && (o instanceof Comparable)) == false) throw
        new IllegalArgumentException("Must compare two instances of comparable");
    if(o instanceof BinNode) {
      return compareTo(((BinNode)o).value);
    }
    return ((Comparable)value).compareTo(o);
  }
}
