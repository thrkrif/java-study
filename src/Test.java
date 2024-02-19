import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() { ++channel; }
    void channelDown() { --channel; }

}

class SmartTv extends Tv{
    boolean caption;

    void displaycaption(String text){
        if(caption){
            System.out.println(text);
        }
    }

}

public class Test {

    public static void main(String[] args) {

        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.caption = true;
        stv.displaycaption("Hello, World");


    }

}



