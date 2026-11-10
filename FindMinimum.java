public class FindMinimum {
   public static void main (String [] args) {
   System.out.println(findMin()); 
   
   
   }
   
   public static int findMin() {
       int minimum = 100;
       for( int i = 0; i < 10; i++){
          int numb =  (int) (Math.random()*100);
          if ( numb < minimum){
          minimum = numb;
   }
     }
  
      return minimum;
   }
   
   
   
}