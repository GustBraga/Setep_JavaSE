package Beakend;

public class CadastroGeral {

	protected String nomeCompleto;
	protected String email;
	protected int idade;
	protected String telefone;
	protected String enderecoCidade;
	protected String enderecoRua;
	protected int enderecoNumero;
	protected int enderecoCep;
	protected String login;
	protected String senha;
	protected String cpf;

	public CadastroGeral(String nomeCompleto, String email, int idade, String telefone, String enderecoCidade,
			String enderecoRua, int enderecoNumero, int enderecoCep, String login, String senha, String cpf) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
		this.enderecoCidade = enderecoCidade;
		this.enderecoRua = enderecoRua;
		this.enderecoNumero = enderecoNumero;
		this.enderecoCep = enderecoCep;
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	char vetorLetrasSemEspaco[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'x', 'z', 'w', 'y' };

	char vetorLetras[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'x', 'z', 'w', 'y', ' ' };

	char vetorDigitos[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	char vetorEmail[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'x', 'z', 'w', 'y', ' ', '@', '.', '_' };

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoRua() {
		return enderecoRua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}

	public int getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(int enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public int getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(int enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public CadastroGeral() {
		super();
	}

	public CadastroGeral(String nomeCompleto, String email, String enderecoCidade, String enderecoRua, String login,
			String senha, int enderecoNumero, int enderecoCep, int idade) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.enderecoCidade = enderecoCidade;
		this.enderecoRua = enderecoRua;
		this.login = login;
		this.senha = senha;
		this.enderecoNumero = enderecoNumero;
		this.enderecoCep = enderecoCep;
		this.idade = idade;
	}

	public boolean stringVerificaTelefone(String tratarString) {

		int cont = 0;

		if (tratarString.charAt(0) == '+' && tratarString.charAt(3) == '(' && tratarString.charAt(6) == ')'
				&& tratarString.charAt(12) == '-') {

			for (int i = 1; i < 3; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {

						cont++;

					}
				}
			}
			for (int i = 4; i < 6; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {

						cont++;

					}
				}
			}
			for (int i = 7; i < 12; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {

						cont++;

					}
				}
			}
			for (int i = 13; i < 17; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {

						cont++;

					}
				}
			}

			if (cont == (tratarString.length() - 4)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean stringVerificaCep(String tratarString) {

		int cont = 0;

		if (tratarString.charAt(5) == '-') {

			for (int i = 0; i < 5; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {

						cont++;

					}
				}
			}

			for (int i = 6; i < 9; i++) {

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

	public boolean stringVerificaCpf(String tratarString) {

		int cont = 0;

		if (tratarString.charAt(3) == '.' && tratarString.charAt(7) == '.' && tratarString.charAt(11) == '-') {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {
						cont++;

					}
				}

			}
			for (int i = 4; i < 7; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {
						cont++;

					}
				}

			}
			for (int i = 8; i < 11; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {
						cont++;

					}
				}

			}
			for (int i = 12; i < 14; i++) {

				for (int j = 0; j < vetorDigitos.length; j++) {

					if (tratarString.charAt(i) == vetorDigitos[j]) {
						cont++;

					}
				}

			}

			if (cont == (tratarString.length() - 3)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean stringVerificaEmail(String tratarString) {

		String aux = tratarString.toLowerCase();
		int verificaArroba = 0;
		int cont = 0;

		for (int i = 0; i < aux.length(); i++) {

			if (aux.charAt(i) == '@') {
				verificaArroba++;
			}

			for (int j = 0; j < vetorEmail.length; j++) {

				if (aux.charAt(i) == vetorEmail[j]) {
					cont++;
				}
			}

			for (int j2 = 0; j2 < vetorDigitos.length; j2++) {

				if (tratarString.charAt(i) == vetorDigitos[j2]) {
					cont++;
				}
			}
		}

		if (verificaArroba > 1) {
			return false;
		}

		if (cont == aux.length()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean stringSoLetrasNome(String tratarString) {

		String aux = tratarString.toLowerCase();
		int cont = 0;

		for (int i = 0; i < aux.length(); i++) {

			for (int j = 0; j < vetorLetras.length; j++) {

				if (aux.charAt(i) == vetorLetras[j]) {
					cont++;
				}
			}
		}

		if (cont == aux.length()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean stringNoDigits(String tratarString) { // Verifica se uma String possui algum digito

		if (tratarString.contains("0") || tratarString.contains("1") || tratarString.contains("2")
				|| tratarString.contains("3") || tratarString.contains("4") || tratarString.contains("5")
				|| tratarString.contains("6") || tratarString.contains("7") || tratarString.contains("8")
				|| tratarString.contains("9")) {

			return false;
		} else if (tratarString.equals("")) {

			return false;

		} else {

			return true;

		}

	}

	public boolean stringOnlyDigits(String tratarString) { // Verifica se uma String so possui digito

		int verifica = 0;

		for (int i = 0; i < tratarString.length(); i++) {

			char dados = tratarString.charAt(i);

			if (dados == '0' || dados == '1' || dados == '2' || dados == '3' || dados == '4' || dados == '5'
					|| dados == '6' || dados == '7' || dados == '8' || dados == '9') {

				verifica++;

			}
		}

		if (verifica == tratarString.length()) {

			return true;
		} else {
			return false;
		}

	}

}
