public class Test4 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            for (int k = 2; k < i+2; k++) {

                System.out.print(" ");                  //시작 k=2 k<2 라서 수행 안하는거 맞음?
            }
            System.out.println();
        }

    }
}
