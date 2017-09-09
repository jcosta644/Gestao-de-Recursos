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
                case 1:
                    gp.printRegisterUser();
                    break;
                case 2:
                    System.out.println("EOQ");
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
                case 8:
                    break;
            }
        } while(opc != 0);
    }
}
