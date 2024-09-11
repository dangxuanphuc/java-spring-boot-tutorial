package Java;

class Mobile {
  String brand;
  int price;
  String network;
  static String name;

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }
}

class Demo {
  public static void main(String args[]) {
    Mobile m1 = new Mobile();
    m1.brand = "Apple";
    m1.price = 1500;
    Mobile.name = "iPhone";

    Mobile m2 = new Mobile();
    m2.brand = "Samsung";
    m2.price = 1000;
    Mobile.name = "Note3";

    Mobile.name = "Phone";

    m1.show();
    m2.show();
  }
}
