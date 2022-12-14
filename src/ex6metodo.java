import java.util.Scanner;

public class ex6metodo {
	public static void main(String[] args) {

//		Algumas universidades est?o adotando o crit?rio de atribuir notas aos alunos como um n?mero inteiro entre 0 e 100. 
//		Voc? dever? escrever um programa em Java para calcular a porcentagem de alunos que est?o acima da m?dia da sala. 
//		O programa dever? funcionar da seguinte maneira: 
//			1) o n?mero de salas de aulas dever? ser informado, 
//			2) para cada sala de aula dever? ser informado o n?mero de alunos e, na sequ?ncia, a m?dia final de cada aluno 
//			da sala. 
//		O programa dever? calcular e imprimir no v?deo a porcentagem de alunos que est?o acima da m?dia da sala 
//		(na impress?o da porcentagem dever? ter 3 casas decimais e tamb?m o s?mbolo de porcentagem). 

		Scanner teclado = new Scanner(System.in);

		int qtdd;

		System.out.println("Informe a quantidade de salas existentes:");
		qtdd = teclado.nextInt();

		int salas[] = new int[qtdd];

		media1(salas);
	}

	public static void media1(int[] salas) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < salas.length; i++) {
			System.out.print("Existem quantos alunos na sala " + (i + 1) + "? ");
			salas[i] = teclado.nextInt();
		}

		media2(salas);

	}

	public static void media2(int[] salas) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < salas.length; i++) {
			double media1[] = new double[salas[i]];

			double media2 = 0;
			double acm = 0;
			double porcent = 0;

			for (int a = 0; a < salas[i]; a++) {
				System.out.print("\nInsira a m?dia do aluno " + (a + 1) + " da sala " + (i + 1) + ": ");
				media1[a] = teclado.nextDouble();
			}

			for (int b = 0; b < salas[i]; b++) {
				media2 = media2 + media1[b];
			}

			media2 = media2 / salas[i];

			for (int c = 0; c < salas[i]; c++) {
				if (media1[c] > media2) {
					acm++;
				}
			}

			porcent = acm * 100 / salas[i];

			System.out.println("\nA porcentagem de alunos acima da m?dia ? --> " + String.format("%.3f", porcent) + "%");

		}
	}
}
