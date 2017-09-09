import utility.*;

/**
 * Created by HP on 03/09/2017.
 */
public class App {

    public static void main(String[] args) {
        GeneralPrints gp = new GeneralPrints();
        int opc;
        do {
            opc = gp.printMenu();
            switch(opc) {
                case 0:
                    gp.printRegisterUser();
                    break;
                case 1:
                    System.out.println("EOQ");
                    break;
                case 2:
                    break;
                case 3:
                     break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        } while(opc != 8);
    }
}
