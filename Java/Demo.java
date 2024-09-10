package Java;

class Demo {
  public static void main(String args[]) {
    int a = 1;

    while (a <= 3) {
      System.out.println("Hi " + a);

      int b = 1;
      while (b <= 2) {
        System.out.println("Hello " + b);
        b++;
      }

      a++;
    }

    System.out.println("Bye " + a);
  }
}
