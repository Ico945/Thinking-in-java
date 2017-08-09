
public class Testmax {
    public static final double a = 0.0001;
    void play(){
        double x1 = 0, x2 = 0, x3 = 0;
        double z = 0;
        for(;x1+x2+x3 <= 10;x1+=a)
            {
                for(;x1+x2+x3 <= 10;x2+=a)
                {
                    for(;x1+x2+x3 <= 10;x3+=a)
                    {
                        if(4*x1+9*x2+2*x3*x3>z)
                            z = 4*x1+9*x2+2*x3*x3;
                    }
                }
            }
        System.out.println((int)x1);
        System.out.println((int)x2);
        System.out.println((int)x3);
        System.out.println((int)z+1);
    }

    public static void main(String[] args) {
        new Testmax().play();
    }
}
