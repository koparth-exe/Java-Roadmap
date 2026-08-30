//Convert Temperature
//Declare a variable "temperature" and initialise it with a value of 25.5 (in Celsius) and Print it in Celsius and Kelvin(add 273 to temperature in Celsius).
//Print the output in the same format as given below.(there is a single space around - (hyphen))
//
//Sample 1:
//Input
//        Output
//Celsius - 25.5
//Kelvin - 298.5

// Code:
public class CCP4 {
    public static void main(String[] args) {
        // Your code goes here
        double temperature = 25.5;
        System.out.println("Celsius - " +temperature);
        System.out.println("Kelvin - " + (temperature + 273));
    }
}
