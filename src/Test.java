import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
    long result1 = mm.add(5L, 3L);
        System.out.println("add(5L,3L) =" + result1);
    }
}


class MyMath{
    long add(long a, long b){
        long result = a+b;
        return result;
    }
    long subtract(long a, long b){
        return a-b;
    }
    long multiply(long a, long b){return a*b;}
    long divide(long a, long b){return a/b;}
}