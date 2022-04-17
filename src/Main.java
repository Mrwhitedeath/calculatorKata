import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите уравнение");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] calcInput = input.split(" ");

        System.out.println(calcInput[0] + " _ " + calcInput[1] + " _ " + calcInput[2]);



        int result = 0;


    }
}

class numbers{

    private boolean isArabic(String num){
        boolean result;
        try {
            int digit = Integer.parseInt(num);
            result = true;
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    private int calculate(int num1, int num2, String operation){
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

