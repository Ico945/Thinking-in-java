package Four;

/**
 * Created by yyyhc on 2017/7/11.
 */
public class Xixuegui {
    public static void main(String[] args){
        select();
    }
    static void select(){
        int[] a = new int[4];
        int w=0,q=0,k=0,l=0,m=0,n=0;
        for(int i = 1000;i<10000;i++) {
            if(i%100!=0) {
                a[0]=i/1000;
                a[1]=i/100%10;
                a[2]=i/10%10;
                a[3]=i%10;
                for(k=0;k<4;k++) {
                    for (l = 0; l<4; l++) {
                        if(l!=k) {
                            w = a[k] * 10 + a[l];
                            for (m = 0;m < 4; m++) {
                                if(m != k && m != l ) {
                                    for (n = 0;n < 4; n++) {
                                        if( n != k && n != l && n != m ) {
                                            q = a[m] * 10 + a[n];
                                            if (i == w * q) {
                                                System.out.println(i);
                                                i++;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
