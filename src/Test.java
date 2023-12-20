import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class MyMath2 {

    int add(int[] a){
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int i = 0; i < a.length; i++)
            result += a[i];

        return result;
    }

}

public class Test {

    public static void main(String[] args) {

        MyMath2 mm = new MyMath2();

        int[] a = {100,200,300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }

}



