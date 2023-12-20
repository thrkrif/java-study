import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class MyMath2 {

    long a, b;

    long add(){return a+b;}
    long subtract(){return a-b;}
    long multiply(){return a*b;}
    double divide(){return a/b;}
    // 인스턴스 메서드

    // 클래스(static) 메서드
    static long add(long a, long b){return a+b;}
    static long subtract(long a, long b){return a-b;}
    static long multiply(long a, long b){return a*b;}
    static double divide(double a, double b){return a/b;}

}

public class Test {

    public static void main(String[] args) {

        System.out.println(MyMath2.add(200,100));

        MyMath2 mm = new MyMath2();
        mm.a = 100;
        mm.b = 200;
        System.out.println(mm.add());

    }

}



