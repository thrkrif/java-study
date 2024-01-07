import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


class Ex6_15{

static int[] arr = new int[10];

static{
        for(int i=0; i<arr.length; i++)
        arr[i] = (int)(Math.random()*10) + 1;
        }



        
        }

public class Test {

    public static void main(String[] args) {

        for(int i=0; i< Ex6_15.arr.length; i++)
        System.out.println("arr["+i+"] : " + Ex6_15.arr[i])
                ;

    }

}



