import java.util.Scanner;

public class ShowYourWorkAddition{

    // We walked through an example of adding 9 and 14
    // number1 = 9, number2 = 14
    // ones_place1 = 9 % 10 = 9, ones_place2 = 14 % 10 = 4
    // tens_place1 = 9 - 9 = 0, tens_place2 = 14 - 4 = 10
    // sum_ones_place = 9 + 4 = 13
    // ones_place_answer = 13 % 10 = 3
    // tens_place_carry = 13 - 3 = 10
    // sum_tens_place = 0 + 10 + 10 = 20
    // result = 20 + 3 = 23
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scan.nextInt();
        System.out.println("Enter the second number");
        int number2 = scan.nextInt();

        // mod (%) is the remainder when I compute a division.  
        // For example, 11 mod 3 = 2 because 3 the remainder when 11 is divided by 3 is 2
        
        int ones_place1 = number1 % 10;
        int ones_place2 = number2 % 10;

        int tens_place1 = number1 - ones_place1;
        int tens_place2 = number2 - ones_place2;

        int sum_ones_place = ones_place1 + ones_place2;

        System.out.println("You entered " + number1 + " and " + number2);
        System.out.println("STEP ONE: " + ones_place1 + " + " + ones_place2 + " = " + sum_ones_place);

        int ones_place_answer = sum_ones_place % 10;
        
        int tens_place_carry = sum_ones_place - ones_place_answer;
        int sum_tens_place = tens_place1 + tens_place2 + tens_place_carry;

        System.out.println("STEP TWO: " + tens_place1 + " + " + tens_place2 + " + " + tens_place_carry + " = " + sum_tens_place);
        int result = sum_tens_place + ones_place_answer;

        System.out.println("STEP THREE: " + sum_tens_place + " + " + ones_place_answer + " = " + result);

        System.out.println("The final result is " + result);

    }
}
