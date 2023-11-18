import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your height in meters: ");
        float heightBielecki = scanner.nextFloat();


        System.out.print("Enter your weight in kilograms: ");
        float weightBielecki = scanner.nextFloat();


        scanner.close();



        float bmi = weightBielecki / (float) Math.pow(heightBielecki, 2);


        if (bmi < 16.00)
        {
            System.out.println("BMI Category: Starvation");
        }
        else if (bmi >= 16.00 && bmi <= 16.99)
        {
            System.out.println("BMI Category: Emaciation");
        }
        else if (bmi >= 17.00 && bmi <= 18.49)
        {
            System.out.println("BMI Category: Underweight");
        }
        else if (bmi >= 18.50 && bmi <= 22.99)
        {
            System.out.println("BMI Category: Normal, Low Range");
        }
        else if (bmi >= 23.00 && bmi <= 24.99)
        {
            System.out.println("BMI Category: Normal, High Range");
        }
        else if (bmi >= 25.00 && bmi <= 27.49)
        {
            System.out.println("BMI Category: Overweight, Low Range");
        }
        else if (bmi >= 27.50 && bmi <= 29.99)
        {
            System.out.println("BMI Category: Overweight, High Range");
        }
        else if (bmi >= 30.00 && bmi <= 34.9) {
            System.out.println("BMI Category: 1st Degree Obesity");
        }
        else if (bmi >= 35.00 && bmi <= 39.9)
        {
            System.out.println("BMI Category: 2nd Degree Obesity");
        } else
        {
            System.out.println("BMI Category: 3rd Degree Obesity");
        }


        System.out.printf("Your BMI: %.2f\n", bmi);

        }
    }
