import java.util.ArrayList;
public class Chap4_7 {
  public static void main(String[] args){
    ArrayList<String> list =
      new ArrayList<String>();
    list.add("日本");
    list.add("アメリカ");
    list.add("イギリス");
    list.add("中国");
    for(String str : list){
      System.out.println(str);
    }
    list.remove(2);
    for(String str : list){
      System.out.println(str);
    }
    System.out.println(list.get(2));
    
  }
}