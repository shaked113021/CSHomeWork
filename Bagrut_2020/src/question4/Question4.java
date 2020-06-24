package question4;

import unit4.collectionsLib.Node;
import unit4.collectionsLib.Stack;

public class Question4 {

  public static Stack<Integer> clone(Stack<Integer> x) {

    Stack<Integer> temp1 = new Stack<>();
    Stack<Integer> temp2 = new Stack<>();

    while(!x.isEmpty()) {
      int val = x.pop();
      temp1.push(val);
      temp2.push(val);
    }

    while(!temp2.isEmpty()) {
      x.push(temp2.pop());
    }

    while(!temp1.isEmpty()) {
      temp2.push(temp1.pop());
    }

    return temp2;
  }

  public static boolean isExist(int num, Stack<Integer> stk) {

    Stack<Integer> temp = new Stack<Integer>();
    boolean wasFound = false;

    while(!stk.isEmpty()) {
      int val = stk.pop();
      temp.push(val);
      if(val % 10 == num)
        wasFound = true;
    }

    while(!temp.isEmpty()) {
      stk.push(temp.pop());
    }

    return wasFound;
  }

  public static boolean allExist(Stack<Integer> stk) {

    Stack<Integer> cloned = clone(stk);
    Node<Integer> nums = new Node<Integer>(0);
    Node<Integer> currNum = nums;

    int firstVal = cloned.pop();
    int firstNum = firstVal % 10;

    while(firstVal >= 10) {
      firstVal = firstVal / 10;
      firstNum = firstVal % 10;
    }

    currNum.setValue(firstNum);

    while(!cloned.isEmpty()) {
      int val = cloned.pop();
      int num = val % 10;

      while(val >= 10) {
        val = val / 10;
        num = val % 10;
      }
      currNum.setNext(new Node<Integer>(num));
      currNum = currNum.getNext();
    }

    currNum = nums;

    while(currNum != null) {
      if(!isExist(currNum.getValue(), stk)) return false;
      currNum = currNum.getNext();
    }

    return true;
  }

}
