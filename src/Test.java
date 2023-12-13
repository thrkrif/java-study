import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class Data2 {int x;}

public class Test {

    public static void main(String[] args) {

        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main 메서드의 d.x="+ d.x +"입니다.");

        change(d);
        System.out.println("After change(d)");
        System.out.println("main 메서드의 d.x="+ d.x +"입니다.");
    }

    static void change(Data2 d){
        d.x=1000;
        System.out.println("change 메서드의 d.x="+d.x+"입니다.");
    }

}



