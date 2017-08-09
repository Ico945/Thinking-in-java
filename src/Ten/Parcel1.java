package Ten;


public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }
    class Distination{
        private String label;
        Distination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contents c = new Contents();
        Distination d = new Distination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
