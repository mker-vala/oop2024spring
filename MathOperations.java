public class MathOperations {
    public static void main(String[] args) {

        double number1 = 10;
        double number2 = 5;


        double sum = number1 + number2;
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + sum);


        double difference = number1 - number2;
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + difference);


        double product = number1 * number2;
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + product);


        if (number2 != 0) {
            double quotient = number1 / number2;
            System.out.println("Division: " + number1 + " / " + number2 + " = " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

