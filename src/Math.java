import java.util.Scanner; // this is the scanner
public class Math { //make the code when you learn the scanner
    public static void main(String[] args) throws Exception { //some goofy as code
        String repeat = "yes";
        while (repeat.equals("yes")) {
            try (Scanner scan = new Scanner(System.in)) { // i dunno what this try does; all i know is that it solved the leak thing; honestly do i even need it?
                System.out.println("Welcome to the calculator thing " + "\n" + "Please input a number to start ");
                double number = scan.nextDouble(); 
                System.out.println("Next, please input the operator thing +, -, /, *, %");
                scan.nextLine();
                String operator = scan.nextLine();
                System.out.println("Now enter the next number that you want the thing to do the thing please");
                double number2 = scan.nextDouble();
                if (operator.equals("*")){ 
                System.out.println ("Your answer is "+(number * number2));
                 } else if (operator.equals("+")){
                System.out.println ("Your answer is "+(number + number2));
                 } else if (operator.equals("-")){
                System.out.println ("Your answer is" +(number - number2));
                 } else if (operator.equals("/")){
                System.out.println ("Your answer is "+(number / number2));
                 } else if (operator.equals("%")){
                System.out.println ("Your answer is "+(number % number2));
                 }
                 // YO I FORGOT TO FACTORIAL NAH IM TOO LAZY
                 System.out.println("Do you want to keep going? (type in yes or no)");
                 scan.nextLine();
                 repeat = scan.nextLine();
            }
        }
        if (repeat.equals("no")){
            System.out.println("Bye Bye :))");
        }
    }
}
