package three;

/**
 * Created by yyyhc on 2017/7/11.
 */
public class Lalala {
    static void main(String[] arg){
        Dog xiaogou = new Dog();
        xiaogou.name="spot";
        xiaogou.says="scruffy";
        xiaogou.shout();

    }
}

class Dog{
    String name;
    String says;
   void shout(){
        System.out.print("wangwang");
    }
}
