import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;



public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i+2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



