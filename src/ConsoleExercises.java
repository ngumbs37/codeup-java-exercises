import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter three words.");
        String word = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        scanner.nextLine();
        System.out.format("%s\n%s\n%s\n", word, word2, word3);

        System.out.println("Enter a sentence.");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        System.out.println("Enter the length of the class");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the width of the class");
        double width = Double.parseDouble(scanner.nextLine());
        double area = length*width;
        double perimeter = (2*length)+(2*width);

        System.out.printf("Using the dimensions given, the area is %s units", area);
        System.out.printf("Using the dimensions given, the perimeter is %s units", perimeter);


    }
}