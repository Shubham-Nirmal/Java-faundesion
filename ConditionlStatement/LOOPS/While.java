package LOOPS;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Any No : ");
      int n = sc.nextInt();
     int   num = 1 ;
      while (num  <= n ) {
        System.err.println(num);
        num++;
      }
    }
}
