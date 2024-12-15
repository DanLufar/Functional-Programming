package functionalProg;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    static MathOperation mathOperation;
    static int result;
    static String name;
    static StringManipulator stringManipulator;
    static String output;


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        result = mathOperation.operate(a, b);
        System.out.println("Result is: " + result);


        name = "Maksym";
        stringManipulator = name -> "Name to Uppercase - " + name.toUpperCase();
        output = stringManipulator.uppercase(name);
        System.out.println(output);


        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        String s = "The Great War";
        int uppercaseCount = uppercaseCounter.apply(s);
        System.out.println("Count uppercase: " + uppercaseCount);


        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        int randomNumber = randomSupplier.get();
        System.out.println("Generated random number: " + randomNumber);
    }


}

