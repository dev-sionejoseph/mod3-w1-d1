import java.util.Scanner;

public class unitconversion {
    public static void main(String[] args) {

        Scanner convert = new Scanner(System.in);

        System.out.println("Length in inches: ");
        int inches = convert.nextInt();

        System.out.println(inches + " inches is equal to " + inches * 0.0254 + " meters");
    }
}
