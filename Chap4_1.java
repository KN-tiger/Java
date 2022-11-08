public class Chap4_1{
  public static void main(String[] args){
    Chara chara1 = new Chara("勇者");
    System.out.println( chara1.getJob() );
    chara1.setJob("戦士");
    chara1.sayJob();
    Chara chara2 = new Chara("剣士");
    Chara chara3 = new Chara("魔法使い");
    chara2.sayJob();
    chara3.sayJob();
  }  
}