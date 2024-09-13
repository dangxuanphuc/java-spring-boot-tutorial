package Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Demo {
  public static void main(String args[]) {
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(6);
    nums.add(2);
    nums.add(9);
    nums.add(7);

    System.out.println(nums.get(0));
    System.out.println(nums.indexOf(9));

    for (int n : nums) {
      System.out.print(n * 2 + " ");
    }
  }
}
