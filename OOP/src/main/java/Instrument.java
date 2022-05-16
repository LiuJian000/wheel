import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Instrument
 * Description:
 * date: 2022/4/20 14:48
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class Instrument {
    public Instrument(){
        System.out.println("Im playing...");
    }
    public Instrument(String name){
        System.out.println("Im playing" + name);
    }
    public void play() {
        System.out.println("Instument is playing...");
    }
}

class Wind extends Instrument {
    public Wind(){
        super("www");
        System.out.println("Im playing Wind");
    }
    @Override
    public void play() {
        System.out.println("Wind is playing...");
    }
}

class Percussion extends Instrument {
    public Percussion(){
        System.out.println("Im playing Percussion");
    }
    @Override
    public void play() {
        System.out.println("Percussion is playing...");
    }
    public void play(String name) {
        System.out.println("Percussion is playing...");
    }
}

class Music {
    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Wind());
        //instruments.add(new Percussion());
        //instruments.add(new Instrument());
        for(Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
