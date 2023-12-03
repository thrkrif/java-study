import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
    Tv t1 = new Tv();
    Tv t2 = new Tv();

    t1.channel = 7;
    t1.channelDown();
        System.out.println("t1의 채널은" + t1.channel + "입니다."
        );
    t2.channel = 7;
    t2.channelUp();
        System.out.println("t2의 채널은" + t2.channel + "입니다."
        );
    }
}
class Tv{
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}


