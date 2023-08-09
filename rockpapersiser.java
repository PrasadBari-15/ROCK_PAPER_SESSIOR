import java.util.Scanner;
import java.util.Random;
 
public class rockpapersiser{
    public static void main(String[] args) {
        int u,rand;
        int uu=0;
        int rr=0;
        int i=1;
                    
       System.out.println("Lets Starts the game:");
       Scanner obj=new Scanner(System.in);
        System.out.println("Choose any one");
        System.out.println("1-->Rock");
        System.out.println("2-->Paper");
        System.out.println("3-->Sissor");
        while(i<=5){
            System.out.println("      ");
            System.out.println("ROUND-->"+i);
        //user choice
        u=obj.nextInt();
        
        if(u==1){
            System.out.println("You chooses rock");
        }
        else if(u==2){
            System.out.println("You chooses paper");
        }
        else if(u==3){
            System.out.println("you chooses sissor");
        }
        //Computer choice
        Random r=new Random();
        rand=r.nextInt(1,4);
        if(rand==1){
            System.out.println("computer chooses rock");
        }
        else if(rand==2){
            System.out.println("computer chooses paper");
        }
        else if(rand==3){
            System.out.println("computer chooses sissor");
                }

        //game logic
        if(u==rand){
            System.out.println("Game is Draw!");
            uu=uu;
            rr=rr;
        }
        else if(u==1 && rand==2){
                    System.out.println("Computer win!");
                    rr=rr+1;
        }
        else if(u==2 && rand==3){
            System.out.println("Computer Win!");
            rr=rr+1;
        }
        else if(u==3 && rand==1){
                    System.out.println("Computer win!");
                    rr=rr+1;
        }
        else if(u==1 && rand==3){
                    System.out.println("You win!");
                    uu=uu+1;
        }
        else if(u==3 && rand==2){
                    System.out.println("You win!");
                    uu=uu+1;
        }
        else if(u==2 && rand==1){
                    System.out.println("You win!");
                    uu=uu+1;
        }
        else {
            System.out.println("Your choice is Invalid So U Loose the Game");
            rr=rr+1;
        }
    
        i++;
    }
      System.out.println("          ");
      System.out.println("Game Result:");
     System.out.println("YOU:"+uu);
     System.out.println("COMPUTER:"+rr);
     if(uu>rr){
            System.out.println("YOU ARE A WINNER......!!!!");
        }
        else if(uu==rr){
            System.out.println("Game Draw.....!");
        }
        else{
            System.out.println("COMPUTER WINNS A GAME...");
        }
        System.out.println("     ");
    }

}