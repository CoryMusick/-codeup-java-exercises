public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);
        String myString = "Hola, World!";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        int x = 4;
//        x = x + 5;
        int a = 4;
        a += 5;
        System.out.println(a);
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
        int b = 3;
        int c = 4;
        c *= b;
        System.out.println(c);
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
        int d = 10;
        int e = 2;
        d /= e;
        // 2 - 5 = -3
        e -= d;
        System.out.println(e);

    }
}
