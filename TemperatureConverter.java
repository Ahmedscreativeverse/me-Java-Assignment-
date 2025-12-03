    




                                                                                                                                    


import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = input.nextDouble();
        
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32; 
        
        
        System.out.println("Temperature in Kelvin: " + kelvin + " K");
        System.out.println("Temperature in Celsius: " + celsius + " °C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "F");

       
    }
}
