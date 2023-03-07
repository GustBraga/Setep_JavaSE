package Beakend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CadastroProfessores extends CadastroGeral {

	private String nrAgencia;
	private String nrConta;
	private String materia;

	public CadastroProfessores(String nrAgencia, String nrConta, String cpf, String materia) {
		super();
		this.nrAgencia = nrAgencia;
		this.nrConta = nrConta;
		this.cpf = cpf;
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public CadastroProfessores() {
		super();
	}

	public String getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean stringVerificaFalta(String tratarString) {
		int cont = 0;

		tratarString = tratarString.trim();

		if (tratarString.length() <= 2) {

			for (int i = 0; i < tratarString.length(); i++) {
				for (int j = 0; j < vetorDigitos.length; j++) {
					if (tratarString.charAt(i) == vetorDigitos[j]) {
						cont++;
					}
				}
			}
		}

		if (cont == tratarString.length()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean stringVerificaConta(String tratarString) {
		int cont = 0;

		if (tratarString.charAt(5) == '-') {

			for (int i = 0; i < 5; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {

						cont++;

					}
				}
			}
			for (int i = 6; i < 7; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {

						cont++;

					}
				}
			}

			if (cont == (tratarString.length() - 1)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean verificaStringNotaQuebrada(String tratarString) {

		int verifica = 0;
		
		if (tratarString.length() > 4) {
			return false;
		}

		if (tratarString.charAt(0) == '0' && tratarString.length() == 1) {
			return true;
		} else if (tratarString.charAt(0) == '0' && tratarString.charAt(1) == '.' && tratarString.length() == 3
				|| tratarString.length() == 4) {

			for (int i = 2; i < tratarString.length(); i++) {

				if (tratarString.charAt(i) == '0' || tratarString.charAt(i) == '1' || tratarString.charAt(i) == '2'
						|| tratarString.charAt(i) == '3' || tratarString.charAt(i) == '4'
						|| tratarString.charAt(i) == '5' || tratarString.charAt(i) == '6'
						|| tratarString.charAt(i) == '7' || tratarString.charAt(i) == '8'
						|| tratarString.charAt(i) == '9') {
					verifica++;
				}
			}

			if (verifica == (tratarString.length() - 2)) {
				return true;
			} else {
				return false;
			}
		} else if (tratarString.charAt(0) == '1' && tratarString.charAt(1) == '0' && tratarString.length() == 2) {
			return true;
		} else if (tratarString.charAt(0) == '1' && tratarString.charAt(1) == '0' && tratarString.length() > 2) {
			return false;
		} else if (tratarString.charAt(1) == '.' && tratarString.length() <= 4) {

			for (int i = 0; i < 1; i++) {

				if (tratarString.charAt(i) == '1' || tratarString.charAt(i) == '2' || tratarString.charAt(i) == '3'
						|| tratarString.charAt(i) == '4' || tratarString.charAt(i) == '5'
						|| tratarString.charAt(i) == '6' || tratarString.charAt(i) == '7'
						|| tratarString.charAt(i) == '8' || tratarString.charAt(i) == '9') {
					verifica++;
				}

			}

			for (int i = 2; i < tratarString.length(); i++) {

				if (tratarString.charAt(i) == '0' || tratarString.charAt(i) == '1' || tratarString.charAt(i) == '2'
						|| tratarString.charAt(i) == '3' || tratarString.charAt(i) == '4'
						|| tratarString.charAt(i) == '5' || tratarString.charAt(i) == '6'
						|| tratarString.charAt(i) == '7' || tratarString.charAt(i) == '8'
						|| tratarString.charAt(i) == '9') {
					verifica++;
				}

			}

			if (verifica == (tratarString.length() - 1)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean verificaCadastro(String login, String senha, String caminhoArquivo) { // é um metodo de garantia e
																							// verificação da senha e do
																							// login para o acesso na
																							// INTRANET

		try {

			FileReader fr = new FileReader(caminhoArquivo.replace(".txt", "CadastroProfessor.txt"));
			BufferedReader br = new BufferedReader(fr);
			boolean verifica = false;

			while (br.ready()) {

				String linha = br.readLine();
				String dados[] = linha.split("#");

				if (dados[8].equals(login) && dados[9].equals(senha)) {

					verifica = true;

				}

			}
			br.close();
			if (verifica) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}

	}

	public boolean alteraCadastro(String nomeCompleto, String email, int idade, String telefone, String enderecoCidade,
			String enderecoRua, int enderecoNumero, int enderecoCep, String login, String senha, String nrAgencia,
			String nrConta, String cpf, String materia, String caminhoArquivo) {

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroProfessor.txt");
		String caminhoArquivoTemp = caminhoArquivo.replace(".txt", "CadastroProfessorTemp.txt");
		int verifica = 0;

		try {

			FileWriter fw = new FileWriter(caminhoArquivoTemp, true);
			BufferedWriter bw = new BufferedWriter(fw);
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);

			nomeCompleto = nomeCompleto.replace("  ", " ").trim();
			email = email.trim();
			idade = Integer.parseInt(Integer.toString(idade).trim());
			telefone = telefone.replace("(", "") + telefone.replace(")", "") + telefone.replace("-", "")
					+ telefone.replace("+", "") + telefone.trim();
			enderecoCidade = enderecoCidade.replace("  ", " ").trim();
			enderecoRua = enderecoRua.replace("  ", " ").trim();
			enderecoNumero = Integer.parseInt(Integer.toString(enderecoNumero).trim());
			enderecoCep = Integer.parseInt(Integer.toString(enderecoCep).trim());
			login = login.trim();
			senha = senha.trim();
			nrAgencia = nrAgencia.trim();
			nrConta = nrConta.replace("-", "").trim();
			cpf = cpf.trim().replace(".", "").replace("-", "");
			materia = materia.replace("  ", " ").trim();

			while (br.ready()) {

				String linha = br.readLine();
				String dados[] = linha.split("#");

				if (dados[8] == login && dados[9] == senha) {

					bw.write(nomeCompleto + "#" + email + "#" + idade + "#" + telefone + "#" + enderecoCidade + "#"
							+ enderecoRua + "#" + enderecoNumero + "#" + enderecoCep + "#" + login + "#" + senha + "#"
							+ nrAgencia + "#" + nrConta + "#" + cpf + "#" + materia);
					verifica++;
					bw.newLine();
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

	public boolean cadastrarProfessor(String nomeCompleto, String email, int idade, String telefone,
			String enderecoCidade, String enderecoRua, int enderecoNumero, int enderecoCep, String login, String senha,
			String nrAgencia, String nrConta, String cpf, String materia, String caminhoArquivo) { // Cadastra os
																									// professores no
																									// banco de dados em
																									// um arquivo txt

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroProfessor.txt");

		try {

			FileWriter fw = new FileWriter(caminhoArquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);

			nomeCompleto = nomeCompleto.replace("  ", " ").trim();
			email = email.trim();
			idade = Integer.parseInt(Integer.toString(idade).trim());
			telefone = telefone.replace("(", "").replace(")", "").replace("-", "").replace("+", "");
			enderecoCidade = enderecoCidade.replace("  ", " ").trim();
			enderecoRua = enderecoRua.replace("  ", " ").trim();
			enderecoNumero = Integer.parseInt(Integer.toString(enderecoNumero).trim());
			enderecoCep = Integer.parseInt(Integer.toString(enderecoCep).trim());
			login = login.trim();
			senha = senha.trim();
			nrAgencia = nrAgencia.trim();
			nrConta = nrConta.replace(".", "").trim();
			cpf = cpf.trim();
			materia = materia.replace("  ", " ").trim();

			bw.write(nomeCompleto + "#" + email + "#" + idade + "#" + telefone + "#" + enderecoCidade + "#"
					+ enderecoRua + "#" + enderecoNumero + "#" + enderecoCep + "#" + login + "#" + senha + "#"
					+ nrAgencia + "#" + nrConta + "#" + cpf + "#" + materia);
			bw.newLine();

			bw.close();
			return true;
		} catch (Exception e) {

			System.err.println(e.toString());

			return false;
		}

	}

	public boolean cadastrarNotas(String nomeAluno, String notaAluno, String materia, String caminhoArquivo) { // Cadastra
																												// de um
																												// determinado
																												// aluno
																												// as
																												// notas
																												// no
																												// banco
																												// de
																												// dados
																												// em um
																												// arquivo
																												// txt

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroNotas.txt");

		nomeAluno = nomeAluno.trim().replace("  ", " ");
		materia = materia.trim().replace("  ", " ");
		notaAluno = notaAluno.trim();

		try {
			FileWriter fw = new FileWriter(caminhoArquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(nomeAluno + "#" + notaAluno + "#" + materia);
			bw.newLine();

			bw.close();

			return true;
		} catch (Exception e) {

			System.err.println(e.toString());

			return false;
		}

	}

	public boolean alterarNotas(String nomeAluno, String materia, String novaNota, String caminhoArquivo) { // Altera a
																											// nota
																											// cadastrada
																											// de um
																											// determinado
																											// aluno

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroNotas.txt");
		String caminhoArquivoTemp = caminhoArquivo.replace(".txt", "Temp.txt");
		boolean verificacao = false;

		try {
			FileWriter fw = new FileWriter(caminhoArquivoTemp, true);
			BufferedWriter bw = new BufferedWriter(fw);
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {

				String linha = br.readLine();

				String dados[] = linha.split("#");

				if (dados[0].equalsIgnoreCase(nomeAluno) && dados[2].equalsIgnoreCase(materia)) {

					linha = (dados[0] + "#" + novaNota + "#" + dados[2]);

					verificacao = true;

					bw.write(linha);
					bw.newLine();
				} else {

					bw.write(linha);
					bw.newLine();

				}

			}

			bw.close();
			br.close();

			File nomePrincipal = new File(caminhoArquivo);
			File nomeTemp = new File(caminhoArquivoTemp);

			if (nomePrincipal.delete()) {

				nomeTemp.renameTo(nomePrincipal);

			}

			if (verificacao) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {

			System.err.println(e.toString());

			return false;
		}

	}

	public boolean cadastrarFaltas(String nomeAluno, String faltasAluno, String materia, String caminhoArquivo) { // Cadastra
																													// as
																													// faltas
																													// de
																													// um
																													// determinado
																													// aluno
																													// no
																													// banco
																													// de
																													// dados
																													// em
																													// um
																													// arquivo
																													// txt

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroFaltas.txt");

		try {
			FileWriter fw = new FileWriter(caminhoArquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(nomeAluno + "#" + faltasAluno + "#" + materia);
			bw.newLine();

			bw.close();

			return true;
		} catch (Exception e) {

			System.err.println(e.toString());

			return false;
		}

	}

	public boolean alterarFaltas(String nomeAluno, String materia, String novaFalta, String caminhoArquivo) { // Altera
																												// a
																												// falta
																												// cadastrada
																												// de um
																												// determinado
																												// aluno

		caminhoArquivo = caminhoArquivo.replace(".txt", "CadastroFaltas.txt");
		String caminhoArquivoTemp = caminhoArquivo.replace(".txt", "Temp.txt");
		boolean verificacao = false;

		try {
			FileWriter fw = new FileWriter(caminhoArquivoTemp, true);
			BufferedWriter bw = new BufferedWriter(fw);
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {

				String linha = br.readLine();

				String dados[] = linha.split("#");

				if (dados[0].equalsIgnoreCase(nomeAluno) && dados[2].equalsIgnoreCase(materia)) {

					linha = (dados[0] + "#" + novaFalta + "#" + dados[2]);

					verificacao = true;

					bw.write(linha);
					bw.newLine();
				} else {

					bw.write(linha);
					bw.newLine();

				}
			}

			bw.close();
			br.close();

			File nomePrincipal = new File(caminhoArquivo);
			File nomeTemp = new File(caminhoArquivoTemp);

			if (nomePrincipal.delete()) {

				nomeTemp.renameTo(nomePrincipal);

			} else {
				System.out.println("Erroo em apagar e renomear os arquivos!");
			}

			if (verificacao) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {

			System.err.println(e.toString());

			return false;
		}

	}

}
