package Nine;
import Eight.Note;

interface Instrment{
    int VALUE = 5;
    void play(Note n);
    void adjust();
}
class Wind implements Instrment{
    public void play(Note n){
        System.out.println(this+ ".play() " + n);
    }
    public String toString(){
        return "Wind";
    }
    public void adjust(){System.out.println(this+".adjust()");}
}
class Percussion implements Instrment{
    public void play(Note n){
        System.out.println(this+".play() "+n);
    }
    public String toString(){return "Percussion";}
    public void adjust(){
        System.out.println(this+".adjust()");
    }
}
class Stringed implements Instrment{
    public void play(Note n){
        System.out.println(this+".play() "+n);
    }
    public String toString(){return "Stringed";}
    public void adjust(){System.out.println(this+".adjust()");}
}
class Brass extends Wind{
    public String toString(){return "Brass";}
}
class WoodWind extends Wind{
    public String toString(){return "WoodWind";}
}
public class Music5 {
    static void tune(Instrment i){
        i.play(Note.MIDDLE_C);
        i.adjust();
    }
    static void tuneAll(Instrment[] e){
        for(Instrment i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrment[] orchestra = {new Wind(),new Percussion(),new Stringed(),new Brass(),new WoodWind()};
        tuneAll(orchestra);
    }
}
