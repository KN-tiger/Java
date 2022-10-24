import java.util.Scanner;
public class Import_resson {
  public static void main(String[] args){
    System.out.println("入力してください");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println("入力したのは" + input);
  }
}