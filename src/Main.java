import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        System.out.println("Введите уравнение");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] calcInput = input.split(" ");

        System.out.println(calcInput.length);

        System.out.println(calcInput[0] + " _ " + calcInput[1] + " _ " + calcInput[2]);

        if (numbers.isArabic(calcInput[0]) & numbers.isArabic(calcInput[2])){
            int result;
            result = numbers.calculate(Integer.parseInt(calcInput[0]), Integer.parseInt(calcInput[2]), calcInput[1]);
            System.out.println("Результат: " + result);
        } else if (numbers.isRoman(calcInput[0]) & numbers.isRoman(calcInput[0])){
        } else {
            System.out.println("Некорректное выражение");
        }
    }
}

class Numbers{

     boolean isArabic(String num){
        boolean result;
        try {
            int digit = Integer.parseInt(num);
            result = true;
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    boolean isRoman(String num){
         return num.matches("[XVI]{1,4}");
    }

    int calculate(int num1, int num2, @NotNull String operation){
        int result = 0;
        switch (operation){
            case ("+") -> result = num1 + num2;
            case ("-") -> result = num1 - num2;
            case ("*") -> result = num1 * num2;
            case ("/") -> result = num1 / num2;
        }
        return result;

    }

}

