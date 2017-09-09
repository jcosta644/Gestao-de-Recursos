import utility.*;

/**
 * Created by HP on 03/09/2017.
 */
public class App {

    public static void main(String[] args) {
        GeneralPrints gp = new GeneralPrints();
        DataBase db = new DataBase();
        int opc;
        do {
            opc = gp.printMenu();
            switch(opc) {
                case 1:
                    db.addPerson(gp.printRegisterUser());
                    break;
                case 2:
                    db.addResource(gp.printRegisterResource());
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
