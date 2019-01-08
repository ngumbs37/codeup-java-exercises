public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int myFavoriteNumber = 37;
        System.out.println(myFavoriteNumber);
        String myString = "I'm Learning how to write Java";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        x = 4;
        x += 5;
        System.out.println(x);

        x = 3;
        y = 4;
        y *= x;
        System.out.println(y);

        x = 10;
        y = 2;
        x /= y;
        System.out.println(x);
        y -= x;
        System.out.println(y);

        System.out.println(Integer.MAX_VALUE);
        int big = Integer.MAX_VALUE;
        big = big + 1;
        System.out.println(big);

    }
}