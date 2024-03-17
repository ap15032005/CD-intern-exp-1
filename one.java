//number guessing game
import java.util.Random;
import java.util.Scanner;
class random1
{
    public static void main(String[] args) 
    {
      System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
      Scanner scan=new Scanner(System.in);
      Random rand=new Random();
      int rad=rand.nextInt(1,100);
     // System.out.println(rad);
      System.out.println("how many chances do you need to guess the number");
      int atempts=scan.nextInt();

      do{
        System.out.println("guess one number in btw 1 to 100");
        int i =scan.nextInt();

        if(rad > i){
            System.out.println("number is too low");
        }
        else if(rad < i){
            System.out.println("number is too high"); 
        }
        else{
            System.out.println("congrats you guessed the number correctly!!");
            break;
        }
        atempts--;
      }while(atempts>0);

      if(atempts<=0)
      System.out.println("Oops!...you ran out of atempts ... ");
      System.out.print("The answer is ");
      System.out.print(rad);

    }

}