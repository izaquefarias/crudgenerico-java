package appProjetoGenerico;

import java.util.Scanner;

public class Usuario {

	Scanner ler = new Scanner(System.in);
	
	private String username;
	private String senha;
	DadosCadastrais dados;
	
	public Usuario() {
		
	}	
	
	public Usuario(String username, String senha, DadosCadastrais dados) {
		this.username = username;
		this.senha = senha;
		this.dados = dados;
	}



	public void criaSenha(){
		boolean processo = false;
		int tentativas = 1;
		while(processo == false) {
			System.out.print("Digite uma senha: ");
			String submissao1 = ler.nextLine();
			System.out.print("Confirme a senha: ");
			String submissao2 = ler.nextLine();
			if(submissao1.equals(submissao2)) {
				this.senha = submissao1;
				System.out.println("Senha cadastrada com sucesso!");
				processo = true;
			}
			else {
				System.out.println("Tentativas: (" + tentativas + ") As senhas não coincidem, tente novamente!");
				tentativas ++;
				processo = false;
			}
		}			
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
