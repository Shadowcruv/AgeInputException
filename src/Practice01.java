import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice01{
    private int num;
    public Practice01(){ num = 34;}
    public void setNum(){
        num = 45;
        if(num == 34){}
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int lowerNumber = 15; int higherNumber =50;

        int age;
        System.out.print("Input your age : ");
      try {
          age = scanner.nextInt();
          if (age<lowerNumber || age >50){
              throw new AgeInputException(age);
          }
          System.out.println("You are "+ age+ "years of age");
      }
      catch (InputMismatchException e){
          System.out.println(" User's input should be in digits ");
      }
      catch(AgeInputException e){
          System.out.println("User typed "+ e.getValue()+ " as age");
      }


    }

}