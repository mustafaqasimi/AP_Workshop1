import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public void takingInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Choose an operator:(+,-,*,/) ");
        char operator = scanner.next().charAt(0);
        calculation(firstNumber,operator,secondNumber);


    }
    public void calculation(int firstNumber, char operator ,int secondNumber){
        switch(operator){
            case '+' ->System.out.print("the sum of "+firstNumber+" and "+secondNumber+" is:" + (firstNumber+secondNumber));
            case '-'->System.out.println("the minus of "+firstNumber+" and "+secondNumber +" is:" + (firstNumber - secondNumber));
            case '*'->System.out.println("the multiplication of "+firstNumber+" and "+secondNumber+" is:" + (firstNumber * secondNumber));
            case '/'->
                System.out.println("the division of "+firstNumber+" and "+secondNumber+" is:" + (firstNumber / secondNumber));


            default -> System.out.println("Invalid operator");


        }

    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.takingInput();

    }
}