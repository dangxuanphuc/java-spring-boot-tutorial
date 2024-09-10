package Java;

class Calculator {
  public int add(int num1, int num2) {
    return num1 + num2;
  }
}

class Demo {
  public static void main(String args[]) {
    int a = 4;
    int b = 7;

    Calculator calc = new Calculator();
    int result = calc.add(a, b);

    System.out.println(result);
  }
}
