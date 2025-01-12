import java.util.Scanner;

public class docBmi {
    public static void main(String[] args) {
        //while (true) {
            //WELCOME MENU
            System.out.println("\nWelcome to the BMI Calculator!\nThis program calculates your Body Mass Index (BMI) and classifies it into a category\n");

            //INTRODUCTION MENU
            System.out.println("How would you like me to call you");
            Scanner one = new Scanner(System.in);
            String name = one.nextLine();
            System.out.println("Nice to have you around " + name + ", You can call me Doctor BMI\n");

            //weight
            System.out.println("Please enter your weight in kilograms:");
            Scanner two = new Scanner(System.in);
            String A = two.nextLine();
            double weight = Double.valueOf(A);

            //height
            System.out.println("Please enter your height in meters:");
            Scanner three = new Scanner(System.in);
            String B = three.nextLine();
            double height = Double.valueOf(B);
            System.out.println("Calculating your BMI... ");
            //BMI Calculation
            double BMI = weight / (height * height);
            System.out.println("\nHeyy there " + name + " your BMI is " + String.format("%.2f%n", BMI));

            //Category
            if (BMI < 18.5) {
                System.out.println("You fall into the category: Underweight");
            } else if (BMI >= 18.5 && BMI < 24.9) {
                System.out.println("You fall into the category: Normal weight");
            } else if (BMI >= 24.9 && BMI < 29.9) {
                System.out.println("You fall into the category: Over weight");
            } else if (BMI >= 30) {
                System.out.println("You fall into the category: Obese");
            }
            System.out.println("Thank you " + name + " for using the BMI Calculator! Stay healthy!");
            //continue;
      //  }
    }
}