import java.util.Scanner;
public class Chap2_3 {
  public static void main(String[] args){
    System.out.println("年齢は");
    Scanner scanner =
      new Scanner(System.in);
    int age =
      Integer.parseInt(scanner.nextLine());
    if( age < 20 ){
      System.out.println("未成年");
    }
  
  }
}