package utility;

import user.*;
/**
 * Created by HP on 03/09/2017.
 */
public class GeneralPrints {
    GeneralScanners sc = new GeneralScanners();

    public int printMenu() {
        System.out.println(
                "Menu:\n" +
                        "1 - Cadastrar Usuario\n" +
                        "2 - Cadastrar Recurso\n" +
                        "3 - Marcar Alocacao de Recurso\n" +
                        "4 - Confirmar Alocacao\n" +
                        "5 - Concluir Alocacao\n" +
                        "6 - Consultar Usuario\n" +
                        "7 - Consultar Recurso\n" +
                        "8 - Relatorio Completo\n" +
                        "0 - Sair\n");
        return sc.scannerInt.nextInt();
    }

    public Person printRegisterUser() {
        GeneralScanners sc = new GeneralScanners();
        Person p = null;

        System.out.println("Digite o nome do usuario:\n");
        String name = sc.scannerString.nextLine();
        System.out.println("Digite o cpf do usuario:\n");
        String cpf = sc.scannerString.nextLine();
        System.out.println("Digite o e-mail do usuario:\n");
        String email = sc.scannerString.nextLine();
        System.out.println("Digite o tipo do usuario:\n" +
                "0 = Aluno de Graduação\n" +
                "1 = Aluno de Mestrado\n" +
                "2 = Aluno de Doutorado\n" +
                "3 = Professor\n" +
                "4 = Pesquisador\n" +
                "5 = Administrador\n");
        int type = sc.scannerInt.nextInt();
        switch (type) {
            case 0:
                p = new UndergraduateStundent(name, email, cpf);
                break;
            case 1:
                p = new MasterStudent(name, email, cpf);
                break;
            case 2:
                p = new PhDStudent(name, email, cpf);
                break;
            case 3:
                p = new Professor(name, email, cpf);
                break;
            case 4:
                p = new Reseacher(name, email, cpf);
                break;
            case 5:
                p = new Admin(name, email, cpf);
                break;
        }
        return p;
    }
}
