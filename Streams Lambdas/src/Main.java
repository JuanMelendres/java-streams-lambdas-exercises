import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
    public static void toUpperCaseAndLowerCase(List<String> input) {
        input.replaceAll(str -> str.toUpperCase());
        System.out.println("Result To UpperCase: " + input);

        input.replaceAll(str -> str.toLowerCase());
        System.out.println("Result To LowerCase: " + input);
    }

    // Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
    public static void filterEvenAndOdd(List<Integer> input) {

        List<Integer> even = input.stream()
                .filter(num -> num % 2 == 0)
                .toList(); // number % 2 == 0
        System.out.println("Even Result: " + even);

        List<Integer> odd = input.stream()
                .filter(num -> num % 2 == 1)
                .toList(); // number % 2 == 1
        System.out.println("Odd Result : " + odd);
    }

    // Java Lambda - Exercises
    public static void main(String[] args) {

        System.out.println("Java Lambda - Exercises");

        // 1.  Write a Java program to implement a lambda expression to find the sum of two integers.
        Calculator calculator = (a, b) -> a + b;

        int sum = calculator.sum(10, 20);
        System.out.println("Sum (10, 20): " + sum);

        int sum2 = calculator.sum(10, -20);
        System.out.println("Sum (10, -20): " + sum2);

        System.out.println("-----------------------------");

        // 2.  Write a Java program to implement a lambda expression to check if a given string is empty.
        Expression expression =str -> str.isEmpty();

        // Test cases
        String str1 = ""; // empty string
        String str2 = "Java lambda expression!"; // non-empty string

        // Check if the strings are empty using the lambda expression
        System.out.println("String 1: " + str1 + "is empty: " + expression.isEmptyString(str1));
        System.out.println("String 1: " + str2 + "is empty: " + expression.isEmptyString(str2));

        System.out.println("-----------------------------");

        // 3.  Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
        List<String> input = Arrays.asList("Java", "Lambda", "Expression");
        toUpperCaseAndLowerCase(input);

        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
        toUpperCaseAndLowerCase(stringList);

        System.out.println("-----------------------------");

        // 4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        filterEvenAndOdd(integerList);

        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        filterEvenAndOdd(nums);

        System.out.println("-----------------------------");

        System.out.println("=================================");

        System.out.println("Java Streams - Exercises");
    }
}

// Java Lambda - Exercises
interface Calculator {
    int sum(int a, int b);
}

interface Expression {
    boolean isEmptyString(String str);
}