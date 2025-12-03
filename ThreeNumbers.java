        
    
    import java.util.Scanner;
        
        public class ThreeNumbers{
   
        public static void main (String[]args){
        Scanner input= new Scanner(System.in);                              
    
    System.out.print("Enter first number: ");
    int firstNumber= input.nextInt();
    
    System.out.print("Enter second number: ");
    int secondNumber= input.nextInt();


    System.out.print("Enter third number: ");
    int thirdNumber = input.nextInt();
 
    int total= firstNumber + secondNumber + thirdNumber;
    
    double average = total/3;

    System.out.println("Total=" + total);
    System.out.println("Average=" + average);

  }
}


            














