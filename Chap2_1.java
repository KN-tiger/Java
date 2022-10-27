import java.util.Scanner;
public class Chap2_1 {
  public static void main(String[] args) {
    System.out.println("年齢は");
    Scanner scanner =
      new Scanner(System.in);
    int age =
      Integer.parseInt(scanner.nextLine());
    System.out.println( age < 20);
  }
}