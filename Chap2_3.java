import java.util.Scanner;
public class Chap2_3 {
  public static void main(String[] args){
    System.out.println("年齢は");
    Scanner scanner =
      new Scanner(System.in);
    int age =
      Integer.parseInt(scanner.nextLine());
    if( age < 20 ){
      System.out.println( age + "歳は");
      System.out.println("未成年");
    }else if( age < 65) {
      System.out.println( age + "歳は");
      System.out.println("成人");
    }else {
      System.out.println( age + "歳は"); 
      System.out.println("高齢者");
    }
  }
}