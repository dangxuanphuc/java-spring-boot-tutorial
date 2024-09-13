package Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Demo {
  public static void main(String args[]) throws NumberFormatException, IOException {
    int num = 0;
    BufferedReader br = new BufferedReader(in);

    try {
      InputStreamReader in = new InputStreamReader(System.in);
      num = Integer.parseInt(br.readLine());
      System.out.println(num);
    } finally {
      br.close();
    }
  }
}
