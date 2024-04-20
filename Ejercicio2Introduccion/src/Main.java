import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Insert the second number: ");
        int numberTwo = scanner.nextInt();
        if(numberOne < numberTwo){
            System.out.println("The smallest number is "+numberOne);
        } else if (numberTwo < numberOne) {
            System.out.println("The smallest number is "+numberTwo);
        }else{
            System.out.println("The two numbers are equal");
        }
    }
}