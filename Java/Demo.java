package Java;

enum Laptop {
  Macbook(2000), Dell(1800), Surface;

  private int price;

  private Laptop() {
    price = 500;
  }

  private Laptop(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}

class Demo {
  public static void main(String args[]) {
    for(Laptop lap : Laptop.values()) {
      System.out.println(lap + ": " + lap.getPrice());
    }
  }
}
