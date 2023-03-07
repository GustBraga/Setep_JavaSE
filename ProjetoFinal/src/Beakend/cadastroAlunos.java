package Beakend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CadastroAlunos extends CadastroGeral {

	private int matricula;
	private String nomeMae;
	private String nomePai;
	private String telefone;
	
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public CadastroAlunos() {
		super();
	}

	
	public CadastroAlunos(String nomeCompleto, String email, int idade, String telefone, String enderecoCidade,
			String enderecoRua, int enderecoNumero, int enderecoCep, String login, String senha, String cpf,
			int matricula, String nomeMae, String nomePai, String telefone2) {
		super(nomeCompleto, email, idade, telefone, enderecoCidade, enderecoRua, enderecoNumero, enderecoCep, login,
				senha, cpf);
		this.matricula = matricula;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		telefone = telefone2;
	}

	public boolean alteraCadastro(String caminhoArquivo, String login, String senha) {
		
		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroAluno.txt");
		String caminhoArquivoTemp = caminhoArquivo.replace(".txt", "CadastroAlunoTemp.txt");
		int verifica = 0;
		
		try {
			
			FileWriter fw = new FileWriter(caminhoArquivoTemp, true);
			BufferedWriter bw = new BufferedWriter(fw);
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);
		
			while (br.ready()) {
				
				String linha = br.readLine();
				String dados[] = linha.split("#");
				
				if (dados[8] == login && dados[9] == senha) {
					
					bw.write(nomeCompleto + "#" + email + "#" + idade + "#" + telefone + "#" + enderecoCidade + "#"
							+ enderecoRua + "#" + enderecoNumero + "#" + enderecoCep + "#" + login + "#" + senha + "#"
							+ matricula + "#" + nomeMae + "#" + nomePai);
					bw.newLine();
					verifica++;
					
				}
				
				bw.write(linha);
				bw.newLine();
	
			}
			
			bw.close();
			br.close();
			
			File nomePrincipal = new File(caminhoArquivo);
			File nomeTemp = new File(caminhoArquivoTemp);

			if (nomePrincipal.delete()) {

				nomeTemp.renameTo(nomePrincipal);

			}
			
			if (verifica == 1) {
				return true;
			} else {
				return false;
			}
			
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean cadastrarAluno(String caminhoArquivo) { // Cadastra os alunos no banco de dados em um arquivo txt

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroAlunos.txt");

		try {

			FileWriter fw = new FileWriter(caminhoArquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(nomeCompleto + "#" + email + "#" + idade + "#" + telefone + "#" + enderecoCidade + "#"
					+ enderecoRua + "#" + enderecoNumero + "#" + enderecoCep + "#" + login + "#" + senha + "#"
					+ matricula + "#" + nomeMae + "#" + nomePai);
			bw.newLine();

			bw.close();
			return true;

		} catch (Exception e) {

			System.err.println(e.toString());

			return false;
		}

	}

	public String exibirNotas(String nome, String materia, String caminhoArquivo) { // Busca e exibe as notas de um determindado aluno 

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroNotas.txt");
		boolean verificacao = false;

		try {
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);
			String linha = null;
			String linha1 = null;

			while (br.ready()) {

				linha = br.readLine();
				String dados[] = linha.split("#");

				if (dados[0].equalsIgnoreCase(nome) && dados[2].equalsIgnoreCase(materia)) {

					linha1 = ("Matéria: " + dados[2] + ", Nota: " + dados[1]);

					verificacao = true;
				}

			}

			br.close();

			if (verificacao) {
				return linha1;
			} else {
				return "Nota não cadastrada!";
			}

		} catch (Exception e) {
			return e.toString();
		}

	}

	public String exibirFaltas(String nome, String materia, String caminhoArquivo) { // Busca e exibe as faltas de um determindado aluno

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroFaltas.txt");
		boolean verificacao = false;

		try {
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);
			String linha = null;
			String linha1 = null;


			while (br.ready()) {

				linha = br.readLine();
				String dados[] = linha.split("#");

				if (dados[0].equalsIgnoreCase(nome) && dados[2].equalsIgnoreCase(materia)) {

					linha1 = ("Matéria: " + dados[2] + ", Falta: " + dados[1]);

					verificacao = true;
				}

			}

			br.close();

			if (verificacao) {
				return linha1;
			} else {
				return "Falta não cadastrada!";
			}

		} catch (Exception e) {
			return e.toString();
		}
	}

	public boolean abrirRequerimento(String nome, int protocolo, String motivoRequerimento, String conteudoRequerimento,
			String caminhoArquivo) { // Cadastra um requerimento no banco de dados em um arquivo txt

		caminhoArquivo = caminhoArquivo.replace(".txt", "Requerimento.txt");
		
		try {

			FileWriter fw = new FileWriter(caminhoArquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("#");
			bw.newLine();
			bw.write("Número Protocolo: " + protocolo);
			bw.write(", Nome Aluno: " + nome);
			bw.write(", Motivo de requerimento: " + motivoRequerimento);
			bw.newLine();
			bw.write("Texto: " + conteudoRequerimento);
			bw.newLine();
			bw.write("#");
			bw.newLine();
			bw.close();

			return true;

		} catch (Exception e) {

			System.err.println(e.toString());

			return false;
		}
	}

}
