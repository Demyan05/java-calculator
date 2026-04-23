import java.util.*;
public class calculator_Mk_2 {
        public static void main(String[] args) {
            Scanner test = new Scanner(System.in);
            char calculator = 'Y';
            while (calculator == 'Y'){
            for (int t = 1;t <= 999;t++) {

                System.out.println("\nPlease enter the first number");
                double num1 = test.nextDouble();
                System.out.println("Please enter the second number");
                double num2 = test.nextDouble();
                if (num1 % 2 == 0){
                    System.out.println("num1 is even");
                } else {
                    System.out.println("num1 is odd");
                }
                if (num2 % 2 == 0){
                    System.out.println("num2 is even");
                } else {
                    System.out.println("num2 is odd");
                }
                System.out.println("Please enter how you want to solve?");
                System.out.println("possible inputs: +,-,^,s for sqrt,*,/");
                char op = test.next().charAt(0);
                double product = 1;
                double product2 = 1;


                switch (op) {

                    case '+':
                        product = num1 + num2;
                        System.out.println(product);
                        System.out.println("Done");
                        break;
                    case '-':
                        product = num1 - num2;
                        System.out.println(product);
                        System.out.println("Done");
                        break;
                    case '^':
                        System.out.println("what's the power of the exponent");
                        int exponent = test.nextInt();
                        for(int a=1; a <= exponent; a++) {
                            product *= num1;
                            product2 *= num2;
                        }
                        System.out.println(num1 + "^" + exponent + "=" + product);
                        System.out.println(num2 + "^" + exponent + "=" + product2);
                        System.out.println("Done");
                        break;
                    case 's':
                        System.out.println("Square root of num1 = " + Math.sqrt(num1));
                        System.out.println("Square root of num2 = " + Math.sqrt(num2));
                        System.out.println("Done");
                        break;
                    case '*':
                        product = num1 * num2;
                        System.out.println(product);
                        System.out.println("Done");
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error can't divide by 0");
                        } else {
                            product = num1 / num2;
                            System.out.println(product);
                            System.out.println("Done");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                    }
                }

            }
        }
}
