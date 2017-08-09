package Five;

import java.util.Arrays;

/**
 * Created by yyyhc on 2017/7/13.
 */
public class VarArgs {
    public static void main(String[] args){
        printArry(new Object[]{
                new Integer(47),new Float(3.14),new Double(11.11)
        });
        printArry(new Object[]{"one","two","three"});
        printArry(new Object[]{new A().toString(),new A(),new A()});
    }

    static void printArry(Object[] args){
        for(Object obj:args)
            System.out.print(obj+" ");
        System.out.println();
    }
}
class A{}
