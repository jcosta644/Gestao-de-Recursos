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
                    gp.printBookResource(db);
                    break;
                case 4:
                    gp.printConfirmBook(db);
                     break;
                case 5:
                    gp.printCompleteBook(db);
                    break;
                case 6:
                    gp.printSearchUser(db);
                    break;
                case 7:
                    gp.printResourceUser(db);
                    break;
                case 8:
                    gp.printReport(db);
                    break;
            }
        } while(opc != 0);
    }
}
