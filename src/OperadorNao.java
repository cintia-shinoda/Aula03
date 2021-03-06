import java.util.Scanner;

public class OperadorNao {

	public static void main(String[] args) {
		
		/* Crie um programa que permita que receba o tipo de um usuário em uma variável String e caso esse tipo NÃO SEJA "administrador", exibir a mensagem: "Atenção, usuário sem poderes administrativos. Algumas tarefas serão bloqueadas". */
		
		Scanner leitor = new Scanner(System.in);
		String tipoUsuario;
		System.out.println("Por favor, digite seu tipo de usuário:");
		tipoUsuario = leitor.next();
		
		if (!tipoUsuario.equalsIgnoreCase("administrador")) {
			System.out.println("Atenção, usuário sem poderes administrativos. Algumas tarefas serão bloqueadas.");
		} else {
			System.out.println("Usuário com poderes administrativos. Fique atento às alterações realizadas.");
		}
		
		
		leitor.close();
		

	}

}
