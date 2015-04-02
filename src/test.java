import java.util.Scanner;
import java.util.InputMismatchException;
public class test{
    private Scanner sc = new Scanner(System.in);
private int askForNumPlayers(String nameIn) {  
           
        int numOpponents = 0;             
         
        boolean retry = false;
        int loopCount = 0;
        while(!retry)
       {
        System.out.println("Hi " + nameIn + ". How many opponents would you like to play against?"); 
        try{
             System.out.println("cek");
        numOpponents = sc.nextInt(); 
        retry = true; // break the loop;
        }catch(InputMismatchException e){  
           loopCount ++;
           if(loopCount == 5) retry = true;  //number of  times allow to loop, if exception occured
        }
        finally {sc = new Scanner(System.in);}
        } 
        return numOpponents;  
    }
    public static void main(String[] args){
        test t = new test();
        t.askForNumPlayers("Rian");
    }
}