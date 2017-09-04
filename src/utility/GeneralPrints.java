package utility;

import utility.GeneralScanners;

/**
 * Created by HP on 03/09/2017.
 */
public class GeneralPrints {
    public int printMenu() {
        GeneralScanners sc = new GeneralScanners();

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
                        "0 - Sair\n" +
                        "Escolha uma opcao: ");
        return sc.scannerInt.nextInt();
    }

    public void printRegisterUser() {
        GeneralScanners sc = new GeneralScanners();

        System.out.println("Digite o nome do usuario:\n");
        sc.scannerString.nextLine();
        System.out.println("Digite o e-mail do usuario:\n");
        sc.scannerString.nextLine();
        System.out.println("Digite a funcao(0 = Aluno, 1 = Professor, 2 = Pesquisador) do usuario:\n");
        sc.scannerInt.nextInt();
    }
}
