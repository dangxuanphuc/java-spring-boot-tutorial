package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Demo {
  public static void main(String args[]) throws IOException {
    System.out.print("Enter a number: ");

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);

    int num = Integer.parseInt(br.readLine());
    System.out.println(num);
    br.close();

    System.out.print("Enter an another number: ");

    Scanner sc = new Scanner(System.in);
    int num2 = Integer.parseInt(sc.nextLine());
    System.out.println(num2);
    sc.close();
  }
}
