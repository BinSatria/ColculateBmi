import java.util.Scanner;

public class KolkulatorBmi {
    public static void main(String[] args) {
        // create intance of Scanner
        Scanner scan = new Scanner(System.in);

        // Instruct the user
        System.out.println("Program ini akan menghitung indeks massa tubuh Anda.");
        System.out.println("Masukkan berat badan Anda.");

        // scan in weight in Ibs
        double weight = scan.nextDouble();

        // Ask for the user's height in inches
        System.out.println("Masukkan tinggi badan Anda.:");
    
        // scann in height in inches
        double height = scan.nextDouble();

        // calculate BMI
        double Bmi = weight / (height * height) * 703;

        //print the BMI
        System.out.println("your BMI is " + Bmi + ".");
    }
}