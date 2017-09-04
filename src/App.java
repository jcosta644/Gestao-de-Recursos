import utility.*;

/**
 * Created by HP on 03/09/2017.
 */
public class App {

    public static void main(String[] args) {
        GeneralPrints gp = new GeneralPrints();
        GeneralScanners sc = new GeneralScanners();
        int opc;
        do {
            gp.printMenu();
            opc = sc.scannerInt.nextInt();
            switch(opc) {
                case 1:
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
                case 8:
                    break;
            }
        } while(opc != 0);
    }
}
