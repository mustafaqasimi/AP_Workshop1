import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public void showMenu(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose a number :\n" +
                    "1.for start:\n" +
                    "2.for exit : ");
            int choice = sc.nextInt();
            if (choice == 1)
                takingInput();
            else
                System.exit(0);

        }

    }
    public void takingInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: \t");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: \t");
        int secondNumber = scanner.nextInt();
        System.out.print("Choose an operator:( + , - , * , / ) \t");
        char operator = scanner.next().charAt(0);
        calculation(firstNumber,operator,secondNumber);


    }
    public void calculation(int firstNumber, char operator ,int secondNumber){
        switch(operator){
            case '+' ->System.out.print("the sum of "+firstNumber+" and "+secondNumber+" is: \t" + (firstNumber+secondNumber));
            case '-'->System.out.println("the minus of "+firstNumber+" and "+secondNumber +" is: \t" + (firstNumber - secondNumber));
            case '*'->System.out.println("the multiplication of "+firstNumber+" and "+secondNumber+" is:\t" + (firstNumber * secondNumber));
            case '/'->
                System.out.println("the division of "+firstNumber+" and "+secondNumber+" is:\t" + (firstNumber / secondNumber));


            default -> System.out.println("Invalid operator");


        }

    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.showMenu();

    }
}