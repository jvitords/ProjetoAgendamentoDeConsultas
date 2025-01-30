package entities;

public class Paciente {

		private String nome;
		private Long cpf; // somente os 6 primeiros numeros
		
		public Paciente(String nomeString, Long cpfInteger) {
			this.nome = nomeString;
			this.cpf = cpfInteger;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nomeString) {
			this.nome = nomeString;
		}

		public Long getCpf() {
			return cpf;
		}

		public void setCpf(Long cpfInteger) {
			this.cpf = cpfInteger;
		}
		
		
}
