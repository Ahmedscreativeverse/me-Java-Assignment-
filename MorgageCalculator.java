

    import java.util.Scanner;
    
    public class MorgageCalculator {
    
    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();
        
        System.out.println("Enter the interest rate: ");
        double interestRate = input.nextDouble();
        
        System.out.println("Enter the duration in years: ");
        double duration = input.nextDouble();
        
        
        double monthlyRate = (interestRate / 100) / 12;
        double months = duration * 12;
        
        double formula = principal * (monthlyRate * Math.pow(1 + monthlyRate, months)) 
                        / (Math.pow(1 + monthlyRate, months) - 1);
        
        System.out.println("Your monthly payment is: a" + formula);
    }
}

         
