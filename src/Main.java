import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Scanner scannerString = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		int quantUsuario, quantRecurso;
		System.out.println("Digite a quantidade de usuarios:\n");
		quantUsuario = scannerInt.nextInt();
		System.out.println("Digite a quantidade de recursos:\n");
		quantRecurso = scannerInt.nextInt();
		int opc = 0;
		int idUsuario = 0;
		int idBuscaUsuario;
		String[] nomeUsuario = new String[quantUsuario];
		String[] emailUsuario = new String[quantUsuario];
		int[] funcaoUsuario = new int[quantUsuario];
		// 0 = Aluno, 1 = Professor, 2 = Pesquisador, 3 = ADM

		int idRecurso = 0;
		int idBuscaRecurso;
		int[] identRecurso = new int[quantRecurso];
		// 0 = Laboratorio, 1 = Auditorio, 2 = Sala de Aula, 3 = Projetor
		String[] statusRecurso = new String[quantRecurso];
		int[][] usuarioAssociado = new int[quantRecurso][100];
		GregorianCalendar[][] dataInicio = new GregorianCalendar[quantRecurso][100];
		GregorianCalendar[][] dataTermino = new GregorianCalendar[quantRecurso][100];
		int[] idLocacao = new int[quantRecurso];
		int idBuscaLocacao;
		int[][] tipoAtividade = new int[quantRecurso][100];
		// 1 = Aula Tradicional, 2 = Apresentacao, 3 = Laboratorio
		String[][] tituloAtividade = new String[quantRecurso][100];
		String[][] descrAtividade = new String[quantRecurso][100];
		String[][] materialApoio = new String[quantRecurso][100];
		int[][][] idParticipantes = new int[quantRecurso][100][100];
		int[] quantParticipantes = new int[quantRecurso];

		do {
			System.out.println(
					"Menu:\n1 - Cadastrar Usuario\n2 - Cadastrar Recurso\n3 - Marcar Alocacao de Recurso\n4 - Confirmar Alocacao\n5 - Concluir Alocacao\n6 - Consultar Usuario\n7 - Consultar Recurso\n8 - Relatorio Completo\n0 - Sair\nEscolha uma opcao: ");
			opc = scannerInt.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Digite o nome do usuario:\n");
				nomeUsuario[idUsuario] = scannerString.nextLine();
				System.out.println("Digite o e-mail do usuario:\n");
				emailUsuario[idUsuario] = scannerString.nextLine();
				System.out.println("Digite a funcao(0 = Aluno, 1 = Professor, 2 = Pesquisador, 3 = ADM) do usuario:\n");
				funcaoUsuario[idUsuario] = scannerInt.nextInt();
				idUsuario++;
				break;
			case 2:
				statusRecurso[idRecurso] = "Em processo de alocacao";
				System.out.println(
						"Digite a identificacao(0 = Laboratorio, 1 = Auditorio, 2 = Sala de Aula, 3 = Projetor) do recurso:\n");
				identRecurso[idRecurso] = scannerInt.nextInt();
				idLocacao[idRecurso] = 0;
				idRecurso++;
				break;
			case 3:
				int ano, mes, dia, hora, minuto;
				System.out.println("Digite o ID do recurso a ser alocado:\n");
				idBuscaRecurso = scannerInt.nextInt();
				if (statusRecurso[idBuscaRecurso].equals("Em processo de alocacao")) {
					System.out.println("Digite o ID do usuario que deseja alocar o recurso:\n");
					idBuscaUsuario = scannerInt.nextInt();
					if (idBuscaUsuario != 0) {
						usuarioAssociado[idBuscaRecurso][idLocacao[idBuscaRecurso]] = idBuscaUsuario;
						System.out.println("Digite o ano de inicio da alocacao:\n");
						ano = scannerInt.nextInt();
						System.out.println("Digite o mes de inicio da alocacao:\n");
						mes = scannerInt.nextInt();
						System.out.println("Digite o dia de inicio da alocacao:\n");
						dia = scannerInt.nextInt();
						System.out.println("Digite as horas de inicio da alocacao:\n");
						hora = scannerInt.nextInt();
						System.out.println("Digite os minutos de inicio da alocacao:\n");
						minuto = scannerInt.nextInt();
						dataInicio[idBuscaRecurso][idLocacao[idBuscaRecurso]] = new GregorianCalendar(ano, mes, dia,
								hora, minuto);
						System.out.println("Digite o ano de termino da alocacao:\n");
						ano = scannerInt.nextInt();
						System.out.println("Digite o mes de termino da alocacao:\n");
						mes = scannerInt.nextInt();
						System.out.println("Digite o dia de termino da alocacao:\n");
						dia = scannerInt.nextInt();
						System.out.println("Digite as horas de termino da alocacao:\n");
						hora = scannerInt.nextInt();
						System.out.println("Digite os minutos de termino da alocacao:\n");
						minuto = scannerInt.nextInt();
						dataTermino[idBuscaRecurso][idLocacao[idBuscaRecurso]] = new GregorianCalendar(ano, mes, dia,
								hora, minuto);
						quantParticipantes[idLocacao[idBuscaRecurso]] = 0;
						idLocacao[idBuscaRecurso]++;
						statusRecurso[idBuscaRecurso] = "Alocado";
						System.out.println("");
					} else {
						System.out.println("Alunos nao podem alocar recursos\n");
					}
				} else {
					System.out.println("O recurso nao pode ser alocado\n");
				}
				break;
			case 4:
				System.out.println("Digite o ID do recurso para confirmar alocacao:\n");
				idBuscaRecurso = scannerInt.nextInt();
				if (statusRecurso[idBuscaRecurso].equals("Alocado")) {
					statusRecurso[idBuscaRecurso] = "Em andamento";
				} else {
					System.out.println("A alocacao do recurso nao pode se confirmada");
				}
				break;
			case 5:
				System.out.println("Digite o ID do recurso para concluir alocacao:\n");
				idBuscaRecurso = scannerInt.nextInt();
				if (statusRecurso[idBuscaRecurso].equals("Em andamento")) {
					System.out.println("Digite o ID da alocacao:\n");
					idBuscaLocacao = scannerInt.nextInt();
					System.out.println(
							"Digite a atividade(1 = Aula Tradicional, 2 = Apresentacao, 3 = Laboratorio) que sera realizada:\n");
					tipoAtividade[idBuscaRecurso][idBuscaLocacao] = scannerInt.nextInt();
					if (((tipoAtividade[idBuscaRecurso][idBuscaLocacao] == 1)
							|| (tipoAtividade[idBuscaRecurso][idBuscaLocacao] == 3))
							&& usuarioAssociado[idBuscaRecurso][idBuscaLocacao] != 1) {
						System.out.println("Apenas professores podem realizar esta atividade:\n");
					} else {
						System.out.println("Digite o ID da alocacao para concluir alocacao:\n");
						idBuscaLocacao = scannerInt.nextInt();
						System.out.println("Digite o titulo da atividade que sera realizada:\n");
						tituloAtividade[idBuscaRecurso][idBuscaLocacao] = scannerString.nextLine();
						System.out.println("Digite a descricao da atividade que sera realizada:\n");
						descrAtividade[idBuscaRecurso][idBuscaLocacao] = scannerString.nextLine();
						System.out
								.println("Digite os materias que serao necessarios para a atividade ser realizada:\n");
						materialApoio[idBuscaRecurso][idBuscaLocacao] = scannerString.nextLine();
						int i = 0;
						do {
							System.out.println(
									"Digite o ID do " + (i + 1) + " usuario associado a atividade(-1 para parar):\n");
							idParticipantes[idBuscaRecurso][idBuscaLocacao][i] = scannerInt.nextInt();
							i++;
							quantParticipantes[idBuscaLocacao]++;
						} while (idParticipantes[idBuscaRecurso][idBuscaLocacao][i - 1] != -1);
						statusRecurso[idBuscaRecurso] = "Concluido";
					}
				} else {
					System.out.println("A alocacao do recurso nao pode ser concluida\n");
				}
				break;
			case 6:
				System.out.println("Digite o ID do usuario que deseja consultar:\n");
				idBuscaUsuario = scannerInt.nextInt();
				if (idBuscaUsuario < idUsuario) {
					System.out.println("Nome: " + nomeUsuario[idBuscaUsuario] + "\nE-mail: "
							+ emailUsuario[idBuscaUsuario] + "\nHistorico:" + "\n\tRecursos Alocados:");
					for (int i = 0; i < idRecurso; i++) {
						for (int j = 0; j < idLocacao[i]; j++) {
							if (usuarioAssociado[i][j] == idBuscaUsuario) {
								System.out.println("\n\tRecurso: ");
								switch (identRecurso[i]) {
								case 0:
									System.out.println("Laboratorio ");
									System.out.println("ID: " + i + "\n");
									break;
								case 1:
									System.out.println("Auditorio ");
									System.out.println("ID: " + i + "\n");
									break;
								case 2:
									System.out.println("Sala De Aula ");
									System.out.println("ID: " + i + "\n");
									break;
								case 3:
									System.out.println("Projetor ");
									System.out.println("ID: " + i + "\n");
									break;
								}
							}
						}
					}
					System.out.println("Atividades Realizadas:\n");
					for (int i = 0; i < idRecurso; i++) {
						for (int j = 0; j < idLocacao[i]; j++) {
							for (int k = 0; k < quantParticipantes[j]; k++) {
								if (idBuscaUsuario == idParticipantes[i][j][k]) {
									System.out.println("\tTitulo: " + tituloAtividade[i][j] + "\n");
									System.out.println("\t\tDescricao: " + descrAtividade[i][j] + "\n");
								}
							}
						}
					}
				} else {
					System.out.println("Usuario nao pode ser encontrado\n");
				}
				break;
			case 7:
				System.out.println("Digite o ID do recurso que deseja consultar:\n");
				idBuscaRecurso = scannerInt.nextInt();
				if (idBuscaRecurso < idRecurso) {
					switch (idBuscaRecurso) {
					case 0:
						System.out.println("Laboratorio\n");
						break;
					case 1:
						System.out.println("Auditorio\n");
						break;
					case 2:
						System.out.println("Sala De Aula\n");
						break;
					case 3:
						System.out.println("Projetor\n");
						break;
					}
					for (int i = 0; i < idLocacao[idBuscaRecurso]; i++) {
						System.out
								.println("Associado: " + "\n\tNome: " + nomeUsuario[usuarioAssociado[idBuscaRecurso][i]]
										+ "\n\tE-mail: " + emailUsuario[usuarioAssociado[idBuscaRecurso][i]] + "\n\tID:"
										+ usuarioAssociado[idBuscaRecurso] + "\n");
						System.out.println("Inicio: " + dataInicio[idBuscaRecurso][i] + "\nTermino: "
								+ dataTermino[idBuscaRecurso][i]);
						System.out.println("Atividade: " + "\n\tTitulo: " + tituloAtividade[idBuscaRecurso][i]
								+ "\n\tDescricao: " + descrAtividade[idBuscaRecurso][i] + "\n\tMaterial: "
								+ materialApoio[idBuscaRecurso][i]);
						System.out.println("Participantes: ");
						for (int j = 0; j < quantParticipantes[i]; j++) {
							System.out.println("\n\tNome: " + nomeUsuario[idParticipantes[idBuscaRecurso][i][j]]
									+ "\n\tE-mail: " + emailUsuario[idParticipantes[idBuscaRecurso][i][j]] + "\n");
						}
						System.out.println("\n");
					}
				} else {
					System.out.println("Recurso nao pode ser encontrado\n");
				}
				break;
			case 8:
				System.out.println("Relatorio Final: " + "\n\tNumero de Usuarios: " + (idUsuario + 1)
						+ "\n\tNumero de Recursos: " + (idRecurso + 1));
				int contEmProcesso = 0, contAlocado = 0, contEmAndamento = 0, contConcluido = 0, cont1 = 0, cont2 = 0,
						cont3 = 0;
				for (int i = 0; i < idRecurso; i++) {
					if (statusRecurso[i].equals("Em processo de alocacao")) {
						contEmProcesso++;
					} else if (statusRecurso[i].equals("Alocado")) {
						contAlocado++;
					} else if (statusRecurso[i].equals("Em andamento")) {
						contEmAndamento++;
					} else {
						contConcluido++;
					}
				}
				System.out.println("\n\tEm processo de alocacao: " + contEmProcesso + "\n\tAlocado: " + contAlocado
						+ "\n\tEm andamento: " + contEmAndamento + "\n\tConcluido: " + contConcluido);
				System.out.println("\n\tRecursos alocados: " + (contAlocado + contEmAndamento + contConcluido));
				for (int i = 0; i < idRecurso; i++) {
					for (int j = 0; j < idLocacao[i]; j++) {
						if (tipoAtividade[i][j] == 1) {
							cont1++;
						} else if (tipoAtividade[i][j] == 2) {
							cont2++;
						} else {
							cont3++;
						}
					}
				}
				System.out.println(
						"Aula Tradicional: " + cont1 + "\nApresentacao: " + cont2 + "\nLaboratorio: " + cont3 + "\n");
				break;
			}
		} while (opc != 0);

	}
}