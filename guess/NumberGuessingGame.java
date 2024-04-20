import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
     public static void main(String[] args) 
    {
        Project obj=new Project();
        obj.random();
        obj.game();
        
    }

}
class Project
{
    int min=1;
    int max=100;
    int random;
    int totalscore=0;
    int maxtry=5;
    String decision;
    Scanner sc=new Scanner(System.in);

    void random()
    {
      Random rand=new Random();
      random=rand.nextInt((max-min+1)+min); 
    }
    
    void game()
    {
       int round=1;
       while(true)
       { 
         random();
         int currtry=1;
         int roundscore=0;
         System.out.println("round:"+round);
       
         while(maxtry>=currtry)
         {
           System.out.println("Enter your guess (1-100):");
           int guess=sc.nextInt();
           sc.nextLine();
           if(guess==random)
           {
              System.out.println("Hurray!Your guess is correct");
              roundscore=(maxtry-currtry)+1;
              totalscore=totalscore+roundscore;
              break;
           }
           else if(guess>random)
           {
             System.out.println("The number is lower to your guess,try again");
           }
           else 
           {
             System.out.println("The number is higher to your guess,try again");
           }
           currtry++;
          }
         System.out.println("Totalscore:"+roundscore);
         System.out.println("Roundscore:"+totalscore);
         System.out.println("Do you want to continue?:(Yes/No)");
         decision=sc.nextLine();
         switch(decision.toLowerCase())
         {
            case "yes":
                break;
            case "no":
                sc.close();
                return;
         }
         round++;
        }
    }
   
   
}

   
       