
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean condizione=true;
        while(condizione){
            System.out.println("Cosa vuoi disegnare? (triangolo/rettangolo/esci)");
            String scelta= input.nextLine();
            if (scelta.equalsIgnoreCase("rettangolo")){
                System.out.println("Disegna un rettangolo");
                System.out.print("Inserisci la base: ");
                int base = input.nextInt();
                input.nextLine();
                
                System.out.print("Inserisci l'altezza: ");
                int altezza= input.nextInt();
                input.nextLine();

                for (int i= 0; i<altezza; i++){
                    for (int j=0; j<base;j++){
                        if (i==0 || i==altezza-1 || j==0 || j==base-1){

                            System.out.print("*");
                        } else{
                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println();
            }
            
            }else if (scelta.equalsIgnoreCase("triangolo")){

                System.out.print("Scrivi l'altezza del triangolo: ");
                int altezza= input.nextInt();
                input.nextLine();
                for (int i=0;i<altezza;i++){
                    for(int j=0;j<=i;j++){

                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }else if (scelta.equalsIgnoreCase("esci")) {
                System.out.println("Grazie per l'uso");
                condizione=false;
            }else {
                System.out.println("Errore digitalizzazione.");
            }
        }
        
        input.close();


    }
}
