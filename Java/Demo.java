package Java;

class Mobile {
  String brand;
  int price;
  String network;
  static String name;

  static {
    name = "Static Phone";
    System.out.println("In static block");
  }

  public Mobile() {
    brand = "";
    price = 200;
    System.out.println("In constructor");
  }

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(Mobile obj) {
    System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
  }
}

class Demo {
  public static void main(String args[]) throws ClassNotFoundException {
    Class.forName("Java.Mobile");

    // Mobile m1 = new Mobile();
    // m1.brand = "Apple";
    // m1.price = 1500;
    // Mobile.name = "iPhone";

    // Mobile m2 = new Mobile();
    // m2.brand = "Samsung";
    // m2.price = 1000;
    // Mobile.name = "Note3";

    // Mobile.name = "Phone";

    // m1.show();
    // m2.show();

    // Mobile.show1(m1);
  }
}
