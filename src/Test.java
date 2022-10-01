public class Test {
    public static void main(String[] args) {
       int x=10;
       int y=20;
       int tmp;
        System.out.println("x="+x);
        System.out.println("y="+y);

       tmp = x;
       x = y;
       y = tmp;

        System.out.println(tmp);
        System.out.println(x);
        System.out.println(y);
    }
}