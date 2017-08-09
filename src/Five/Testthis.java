package Five;

/**
 * Created by yyyhc on 2017/7/12.
 */
public class Testthis {
    public static void main(String[] args){
        Banana a = new Banana(), b = new Banana();
        a.peel1();
    }
}
/*
*构造器中调用另一个构造器
* 构造器之间调用时只能调用一个，不能同时调用两个
*/
class Banana{
    int i=1;
    void peel1(){
        peel2();
        System.out.println(i);
        this.peel2();
        System.out.println(i);
    }
    void peel2(){
        i++;
    }
}
