package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface {
	public static void mostrarMensagemDefault(ArrayList<String> lista_opcoes) {
		System.out.println("Insira um número entre 0 e " + lista_opcoes.size());
	}
	
	public static void montarMenu(String tipo, ArrayList<String> lista_opcoes) {
		boolean is_principal = tipo.equals("principal");
		String complemento = (is_principal ? "Gestão de " : "");
		
		System.out.println("MENU " + tipo.toUpperCase());
		
		for (int i = 0; i < lista_opcoes.size(); i++) {
			System.out.println((i + 1) + ". " + complemento + lista_opcoes.get(i));
		}
		
		System.out.println("0. " + (is_principal ? "Sair do programa" : "Voltar ao menu anterior"));
	}
	
	public static void gestaoClientes() {
		int opcao_usuario = 1;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Inserir", "Consultar", "Listar", "Excluir", "Alterar")
		);
		
		while (opcao_usuario != 0) 
		{
			Interface.montarMenu("gestão de clientes", lista_opcoes);
			System.out.print("\nSua opção: ");
			opcao_usuario = entrada.nextInt();
			
			switch (opcao_usuario)
			{
				case 0:
					System.out.println("Retornando...");
					break;
			
				case 1: 
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				default:
					Interface.mostrarMensagemDefault(lista_opcoes);
					break;
			}
		}
	}
	
	public static void gestaoImoveis() {
		int opcao_usuario = 1;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Inserir", "Consultar", "Listar", "Excluir", "Alterar")
		);
		
		while (opcao_usuario != 0) 
		{
			Interface.montarMenu("gestão de imóveis", lista_opcoes);
			System.out.print("\nSua opção: ");
			opcao_usuario = entrada.nextInt();
			
			switch (opcao_usuario)
			{
				case 0:
					System.out.println("Retornando...");
					break;
			
				case 1: 
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				default:
					Interface.mostrarMensagemDefault(lista_opcoes);
					break;
			}
		}
	}

	public static void gestaoFaturas() {
		int opcao_usuario = 1;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Registro de consumo", "Listar faturas")
		);
		
		while (opcao_usuario != 0) 
		{
			Interface.montarMenu("gestão de faturas", lista_opcoes);
			System.out.print("\nSua opção: ");
			opcao_usuario = entrada.nextInt();
			
			switch (opcao_usuario)
			{
				case 0:
					System.out.println("Retornando...");
					break;
			
				case 1: 
					break;
					
				case 2:
					break;
					
				default:
					Interface.mostrarMensagemDefault(lista_opcoes);
					break;
			}
		}
	}
	
	public static void gestaoPagamentos() {
		int opcao_usuario = 1;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Inclusão de pagamentos", "Listar pagamentos", "Listar reembolsos")
		);
		
		while (opcao_usuario != 0) 
		{
			Interface.montarMenu("gestão de clientes", lista_opcoes);
			System.out.print("\nSua opção: ");
			opcao_usuario = entrada.nextInt();
			
			switch (opcao_usuario)
			{
				case 0:
					System.out.println("Retornando...");
					break;
					
				case 1: 
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				default:
					Interface.mostrarMensagemDefault(lista_opcoes);
					break;
			}
		}
	}
	
	public static void gestaoFalhas() {
		int opcao_usuario = 1;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Incluir falhas com matrícula", "Incluir falhas sem matrícula")
		);
		
		while (opcao_usuario != 0) 
		{
			Interface.montarMenu("gestão de falhas", lista_opcoes);
			System.out.print("\nSua opção: ");
			opcao_usuario = entrada.nextInt();
			
			switch (opcao_usuario)
			{
				case 0:
					System.out.println("Retornando...");
					break;
				
				case 1: 
					break;
					
				case 2:
					break;
					
				default:
					Interface.mostrarMensagemDefault(lista_opcoes);
					break;
			}
		}
	}
	
	public static void gestaoReparos() {
		int opcao_usuario = 1;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Listar reparos em aberto", "Encerrar reparo (poss outro)")
		);
		
		while (opcao_usuario != 0) 
		{
			Interface.montarMenu("gestão de reparos", lista_opcoes);
			System.out.print("\nSua opção: ");
			opcao_usuario = entrada.nextInt();
			
			switch (opcao_usuario)
			{
				case 0:
					System.out.println("Retornando...");
					break;
			
				case 1: 
					break;
					
				case 2:
					break;
					
				default:
					Interface.mostrarMensagemDefault(lista_opcoes);
					break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<String> lista_opcoes = new ArrayList<String>(
		List.of("Imóveis", "Faturas", "Pagamentos", "Falhas")
		);
		int opcao_usuario = 1;
		String nome, email;
		Scanner entrada = new Scanner(System.in);
		
		while (opcao_usuario != 0) 
		{
			Interface.montarMenu("principal", lista_opcoes);
			System.out.print("\nSua opção: ");
			opcao_usuario = entrada.nextInt();
			
			switch (opcao_usuario)
			{
				case 0:
					System.out.println("Fim do programa!");
					break;
				
				case 1: // Imóveis
					gestaoClientes();
					break;
					
				case 2: // Faturas
					gestaoImoveis();
					break;
					
				case 3:
					gestaoFaturas();
					break;
					
				case 4:
					gestaoPagamentos();
					break;
					
				case 5:
					gestaoFalhas();
					break;
					
				default:
					Interface.mostrarMensagemDefault(lista_opcoes);
					break;
			}
		}
	}
}