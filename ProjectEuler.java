public class ProjectEuler { 

    

   

   public static int problem1(){ 

      

      int sum1 = 0;  

      for(int n = 3; n < 1000; n = n +3 ) 

      { 

        sum1+=n; 

         

      } 

      int sum2 =0; 

       

      for(int i = 5; i < 1000; i+=5){ 

      sum2+=i; 

       

      } 

         int sum3 = 0; 

        for(int j = 15; j < 1000; j += 15)  

      { 

        sum3 += j; 

      } 

       

      return sum1 + sum2 - sum3; 

   } 

    

   public static int problem2() { 

      return 0; 

   } 

    

   public static void main(String[] args) { 

      System.out.println("The answer to problem 1 is: " + problem1()); 

      System.out.println("The answer to problem 2 is: " + problem2());       

   }   

} 