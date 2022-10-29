import java.util.Scanner;
public class Chap2_6{
  public static void main(String[] args){
    System.out.println("年齢は");
    Scanner scanner =
      new Scanner(System.in);
    if( ! scanner.hasNextInt() ){
      System.out.println("数値を入力してください");
    }else{
      int age =
      Integer.parseInt(scanner.nextLine());
      System.out.println("年齢は" + age + "歳");
    }
  }
}