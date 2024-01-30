import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь введите любые числа: ");
        System.out.println("Введите число 1: ");
        double number1 = scanner.nextDouble();
        System.out.println("Введите число 2: ");
        double number2 = scanner.nextDouble();
        Arithmetic arithmetic = new Arithmetic(number1,number2);
        double doubleBox = arithmetic.addition();
        boolean isEvenAddition = isEvenAddition(doubleBox);
        System.out.println("Результат суммы: " + arithmetic.addition() + "\nЯвляется ли сумма чётная " + isEvenAddition);
        double doubleBox1 = arithmetic.substraction();
        boolean isEvenSubstraction = isEvenSubstraction(doubleBox1);
        System.out.println("Результат вычетания: " + arithmetic.substraction() + "\nЯвляется ли вычетание чётным " + isEvenSubstraction);
        double doubleBox2 = arithmetic.division();
        boolean isEvenDivision = isEvenDivision(doubleBox2);
        System.out.println("Результат деления: " + arithmetic.division() + "\nЯвляется ли деление чётным " + isEvenDivision);
        double doubleBox3 = arithmetic.miltiply();
        boolean isEvenMultiply = isEvenMultiply(doubleBox3);
        System.out.println("Результат умножения: " + arithmetic.miltiply() + "\nЯвляется ли умножение чётным " + isEvenMultiply);
    }
    public static boolean isEvenAddition(double doubleBox) {
        boolean isEvenAddition = (doubleBox % 2) == 0;
        return isEvenAddition;
    }
    public static boolean isEvenSubstraction(double doubleBox1) {
        boolean isEvenSubstraction = (doubleBox1 % 2) == 0;
        return isEvenSubstraction;
    }
    public static boolean isEvenDivision(double doubleBox2) {
        boolean isEvenDivision = (doubleBox2 % 2) == 0;
        return isEvenDivision;
    }
    public static boolean isEvenMultiply(double doubleBox3) {
        boolean isEvenMultiply = (doubleBox3 % 2) ==0;
        return isEvenMultiply;
    }
}