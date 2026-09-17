import java.util.Scanner;    

  

    

  

public class CooperIsMyDog   {    

  

   public static void main(String[] args)  {    

  String MyDog = ("Cooper");

      int Num = 12;    

      int ageInDogYears;    

      int ageInHumanYears;
      
      double cooperIsYrsOld = 4.0; 

      boolean IsCooperCute = true;      
      System.out.println ("My dog's name is Cooper");  

      Scanner scan = new Scanner (System.in); 

      System.out.println ("How old is your dog?");          

      ageInHumanYears = scan.nextInt(); 

      ageInDogYears = ageInHumanYears * 7; 

  System.out.println ("your dog is \"" + ageInDogYears +"\" years old in dog years");    
 
     }  

}                 