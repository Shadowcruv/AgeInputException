public class AgeInputException extends Exception{
  private int years;

   public AgeInputException(int a){
     years = a;
   }
   public int getValue(){
      return years;
   }

}
