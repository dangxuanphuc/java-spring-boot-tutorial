package Java;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Demo {
  public static void main(String args[]) {
    Set<Integer> nums = new TreeSet<Integer>();
    nums.add(9);
    nums.add(6);
    nums.add(2);
    nums.add(7);

    Iterator<Integer> values = nums.iterator();

    while(values.hasNext()) {
      System.out.println(values.next());
    }
  }
}
