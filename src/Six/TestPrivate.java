package Six;

/**
 * Created by yyyhc on 2017/7/14.
 */
public class TestPrivate {
    public static void main(String[] args){
        Sundae x = Sundae.makeASundae();
        Sundae.access().f();
    }
}
class Sundae{
    Sundae(){}
    private static Sundae s1 = new Sundae();
    public static Sundae access(){
        return s1;
    }
    public void f(){}
    static Sundae makeASundae(){
        return new Sundae();
    }
}