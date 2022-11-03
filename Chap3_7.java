public class Chap3_7{
  public static void main(String[] args) {
    String[] team = {"A", "B", "C", "D", "E"};
    for (String t1 : team){
      for (String t2 : team){
        if( !t1.equals(t2)){
          System.out.println( t1 + "vs" + t2);
        }
      }
    }
    for(int i = 0; i < team.length; i++){
      System.out.println( team[i]);
    }
  } 
}

