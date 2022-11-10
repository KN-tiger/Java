import java.util.ArrayList;
public class Chap4_8{
  public static void main(String[] args){
    String[] jobList =
      {"剣士","魔法使い","格闘家","僧侶"};
    ArrayList<Chara> charaList =
      new ArrayList<Chara>();
    for(String job : jobList){
      charaList.add( new Chara(job) );
    }   
    for(Chara chara : charaList){
      chara.sayJob();
    } 
  }
}