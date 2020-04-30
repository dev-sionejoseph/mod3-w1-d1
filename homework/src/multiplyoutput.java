import java.util.Scanner;

public class multiplyoutput {

    public static void main(String[] args) {
        Scanner product= new Scanner(System.in);

        System.out.println("Enter your first number:");
        int numOne = product.nextInt();

        System.out.println("Enter your second number:");
        int numTwo = product.nextInt();

        System.out.println("The product of your two numbers equals: " + numOne * numTwo);
    }
}
