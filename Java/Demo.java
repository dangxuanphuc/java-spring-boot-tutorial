package Java;

class Calculator {
  int num = 5;

  public int add(int n1, int n2) {
    return n1 + n2;
  }
}

class Demo {
  public static void main(String args[]) {
    Calculator cal = new Calculator();
    Calculator cal1 = new Calculator();

    int result = cal.add(10, 3);
    System.out.println(result); // 13

    cal.num = 8;

    System.out.println(cal.num); // 8
    System.out.println(cal1.num); // 5
  }
}
