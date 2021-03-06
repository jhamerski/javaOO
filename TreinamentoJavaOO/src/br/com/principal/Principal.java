package br.com.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.com.classes.Aluno;
import br.com.classes.Diretor;
import br.com.classes.Disciplina;
import br.com.classes.Secretario;
import br.com.classesauxiliares.FuncaoAutenticacao;
import br.com.constantes.StatusAluno;
import br.com.excecao.ExcecaoProcessarNota;
import br.com.interfaces.PermitirAcesso;

public class Principal {

	public static void main(String[] args) throws ExcecaoProcessarNota {

		try {
			//lerArquivo();
			
			Scanner teclado = new Scanner(System.in);

			System.out.print("Informe o login: ");
			String login = teclado.next();
			System.out.print("Informe e senha: ");
			String senha = teclado.next();

			// FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();

			// PermitirAcesso permitirAcesso = new Secretario(login, senha);

			if (new FuncaoAutenticacao(new Diretor(login, senha))
					.autenticar()) {/* Vou travar o contrato para autorizar o login tendo contrato 100% leg�timo */

				List<Aluno> alunos = new ArrayList<Aluno>();

				// lista que dentro dela temos uma chave que identifica uma sequencia de valores
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				System.out.print("Quantos alunos deseja cadastrar: ");
				int qtd = teclado.nextInt();

				for (int i = 1; i <= qtd; i++) {

					Aluno aluno = new Aluno();

					System.out.print("Informe o nome do " + i + "� aluno: ");
					String nome = teclado.next();
					aluno.setNome(nome);

					for (int j = 1; j <= 2; j++) {
						Disciplina disciplina = new Disciplina();

						System.out.print("Informe o nome da " + j + "� disciplina: ");
						String nomeDisciplina = teclado.next();
						System.out.print("Informe a nota " + j + "� nota: ");
						double nota = teclado.nextDouble();

						disciplina.setDisciplina(nomeDisciplina);
						//disciplina.setNota(nota);

						aluno.getDisciplinas().add(disciplina);
					}

					alunos.add(aluno);

				}

				for (Aluno alu : alunos) {
					System.out.println("O aluno " + alu.getNome() + " ficou com m�dia " + alu.calculaMedia() + ".");
				}

				System.out.print("Informe o nome do aluno para saber se foi aprovado: ");
				String procurado = teclado.next();
				for (Aluno aluno : alunos) {
					if (aluno.getNome().equalsIgnoreCase(procurado)) {
						System.out.println(
								"Aluno: " + aluno.getNome().toUpperCase() + " est� " + aluno.statusAprovacao());
					}
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("\n--------LISTA DOS APROVADOS--------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno " + aluno.getNome() + " ficou com m�dia: " + aluno.calculaMedia());
				}
				System.out.println("-------LISTA DOS RECUPERA��O-------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno " + aluno.getNome() + " ficou com m�dia: " + aluno.calculaMedia());
				}
				System.out.println("--------LISTA DOS REPROVADOS-------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno " + aluno.getNome() + " ficou com m�dia: " + aluno.calculaMedia());
				}
			} else {
				System.out.println("Login ou senha inv�dos.");
			}

		} catch (Exception e) {

			/* Imprime erro no consolel java */
			e.printStackTrace();

			/* Mensagem do erro ou causa */
			System.out.println("Mensagem: " + e.getMessage());

			System.out.println("Erro ao processar notas.");

			for (int i = 0; i < e.getStackTrace().length; i++) {
				System.out.println("Classe de erro: " + e.getStackTrace()[i].getClassName());
				System.out.println("M�todo de erro: " + e.getStackTrace()[i].getMethodName());
				System.out.println("Linha de erro: " + e.getStackTrace()[i].getLineNumber());

			}
		} finally {
			System.out.println("Obrigado por aprender java comigo.");
		}
	}
	
	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File file = new File("c://lines.txt");
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
		
	}

}
