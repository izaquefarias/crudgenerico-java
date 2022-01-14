package appProjetoGenerico;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cadastro de Usuário - Digite os dados: ");
		
		Usuario user = new Usuario();
		DadosCadastrais novosDados = new DadosCadastrais();
		user.dados = novosDados;
				
		
		System.out.print("Nome: ");
		user.dados.setNome(ler.nextLine());
		System.out.print("Endereço: ");
		user.dados.setEndereco(ler.nextLine());
		System.out.print("Cpf: ");
		user.dados.setCpf(ler.nextLine());		
		System.out.print("Digite um nome de usuário: ");
		user.setUsername(ler.nextLine());
		user.criaSenha();
		
		
		ler.close();
	}

}
