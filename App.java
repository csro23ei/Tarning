import java.util.Random;
import java.util.Scanner;

public class App
{
    /**
     * @param arg
     * @throws Exception
     */
    public static void main(String[] arg) throws Exception
    {

              Scanner input = new Scanner(System.in);
               int confirm;
               // En Do while loop för att man ska slipa starta programet varje gång.
         do {
            // ger dig förslag att välja på 
              int operator;
             System.out.println("1- 4 sidig tärning /n 2- Vanlig tärning /n3- 8 sidig tärning /n4- 20 sidig tärning");
              System.out.println("Vad vill du göra?");
              // läser in vall
              Scanner sc = new Scanner(System.in);
              operator =sc.nextInt();

              
                switch(operator)
               {
                   case 1:
                   Random r = new Random();
                   int low = 1;
                   int high = 5;
                   int result = r.nextInt(high-low) + low;
                   System.out.println("Du slog en:" + result);
                   break;


                 case 2: 
                  Random r2 = new Random();
                  int low2 = 1;
                  int high2 = 7;
                  int result2 = r2.nextInt(high2-low2) + low2;
                  System.out.println("Du slog en:" + result2);
                  break;



                 case 3: 
                  Random r3 = new Random();
                  int low3 = 1;
                  int high3 = 9;
                  int result3 = r3.nextInt(high3-low3) + low3;
                  System.out.println("Du slog en:" + result3);
                  break;


                   case 4: 
                  Random r4 = new Random();
                  int low4 = 1;
                  int high4 = 21;
                  int result4 = r4.nextInt(high4-low4) + low4;
                  System.out.println("Du slog en:" + result4);
                  break;
 
                }
                System.out.println("Tryck 9 för att av sluta");
               confirm = input.nextInt();
            } while (confirm != 9);
        
         System.out.println("Programet har av slutats var vänlig och starta om programet om du vill börja om ");


    }
}