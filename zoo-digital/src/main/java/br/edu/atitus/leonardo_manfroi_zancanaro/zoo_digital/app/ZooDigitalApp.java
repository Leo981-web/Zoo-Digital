package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Animal;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Aves;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Cachorro;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Coruja;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Crocodilo;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.DragaoVoador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Gato;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Golfinho;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.PapagaioDoMar;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Pato;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.PeixeEspada;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Pinguin;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Pirarocu;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Repteis;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Sucuri;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Tartaruga;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Traira;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Tubarao;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais.Vaca;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Voador;



public class ZooDigitalApp {
	
	private static Scanner scanner = new Scanner(System.in);
	private static List<Animal> animais = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		
		System.out.println("=== Bem-vindo ao Zoo Digital! ===");
		
		while (true) {
		
			
			exibirMenu();
				
			try {
				
				int opcao = Integer.parseInt(scanner.nextLine());
				
				switch (opcao) {
				case 1:
					cadastrarAnimal();
					break;
				case 2:
					listarAnimais();
					break;
				case 3:
					listarAnimaisCorredores();
					break;
				case 4:
					listarAnimaisNadadores();
					break;
				case 5:
					listarAnimaisVoadores();
					break;
				case 6:
					listarAnimaisPredadores();
					break;
				case 7:
					exibirTotalAnimais();
					break;
				case 0:
					System.out.println("Saido... Até logo");
					return;

				default:
					System.out.println("Opção inválida. Por favor, tente novamente!");
					break;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Erro! Por favor, Digite um numero valido.");
			}
			
			System.out.println("Pressione enter para continuar...");
			scanner.nextLine();
		
		}	
		
	}
	
	private static void exibirMenu() {
		System.out.println("Selicione uma opção!");
		System.out.println("1 - Cadastrar novo animal.");
		System.out.println("2 - Listar todos os animais do Zoo.");
		System.out.println("3 - Listar animais Corredores.");
		System.out.println("4 - Listar animais Nadadores.");
		System.out.println("5 - Listar animais Voadores.");
		System.out.println("6 - Listar animais Predadores.");
		System.out.println("7 - Exibir a quantidade total de animais cadstrados no Zoo.");
		System.out.println("0 - Sair.");
	};

	
	private static void cadastrarAnimal() {
		System.out.println("--- 1 Cadastrar Animal ---");
		System.out.println("Escolha o tipo de Animal que deseja Cadastrar: ");
		System.out.println("1 - Mamíferos");
		System.out.println("2 - Aves");
		System.out.println("3 - Peixes");
		System.out.println("4 - Répteis");
		System.out.println("0 - Voltar");
		
		int opcaoCadastro = Integer.parseInt(scanner.nextLine());
		
		Animal novoAnimal = null;
		
		switch (opcaoCadastro) {
		case 1:
			novoAnimal = cadastroMamiferos();
			break;
		case 2:
			novoAnimal = cadastroAve();
			break;
		case 3:
			novoAnimal = cadastroPeixe();
			break;
		case 4:
			novoAnimal = cadastroReptil();
			break;
			
		default:
			System.out.println("Opção Invalida!");
			return;
		}
		
		if (novoAnimal != null) {
			animais.add(novoAnimal);
			System.out.println(novoAnimal.getNome() + " foi Cadastrado com sucesso!");
		} else {
			System.out.println("Cadastro cancelado!");
		}
	}
	
	private static Animal cadastroMamiferos() {
		System.out.println("Escolha um Animal:");
		System.out.println("1 - Cachorro (Corredor)");
		System.out.println("2 - Vaca (Corredor)");
		System.out.println("3 - Gato (Corredor)");
		System.out.println("4 - Golfinho (Aquático)");
		System.out.println("0 - Voltar");
		
		int opcaoMamiferos = Integer.parseInt(scanner.nextLine());
		
		if (opcaoMamiferos == 0) {
			return null;
		} 
		
		System.out.print("Digite o Nome do Animal: ");
		String nome = scanner.nextLine();
		System.out.print("Digite a Idade do Animal:  ");
		int idade = Integer.parseInt(scanner.nextLine());
		
			
		switch (opcaoMamiferos) {
		case 1:
			return new Cachorro(nome, idade);
		case 2:
			return new Vaca(nome, idade);
		case 3:
			return new Gato(nome, idade);
		case 4:
			return new Golfinho(nome, idade);
		default:
			System.out.println("Opção Invalida!");
			return null;
		}
	}
			
		private static Animal cadastroPeixe() {
			System.out.println("Escolha um Peixe:");
			System.out.println("1 - Peixe-Espada (Aquático)");
			System.out.println("2 - Pirarocu (Aquático)");
			System.out.println("3 - Tubarão (Aquático)");
			System.out.println("4 - Traíra (Aquático)");
			System.out.println("0 - Voltar");
			
			int opcaoPeixe = Integer.parseInt(scanner.nextLine());
			
			if (opcaoPeixe == 0) {
				return null;
			} 
			
			System.out.print("Digite o Nome do Peixe: ");
			String nome = scanner.nextLine();
			System.out.print("Digite a Idade do Peixe:  ");
			int idade = Integer.parseInt(scanner.nextLine());
			
				
			switch (opcaoPeixe) {
			case 1:
				return new PeixeEspada(nome, idade);
			case 2:
				return new Pirarocu(nome, idade);
			case 3:
				return new Tubarao(nome, idade);
			case 4:
				return new Traira(nome, idade);
			default:
				System.out.println("Opção Invalida!");
				return null;
			}
		}
			
			private static Animal cadastroAve() {
				System.out.println("Escolha uma Ave:");
				System.out.println("1 - Pato (Aquático)");
				System.out.println("2 - Papagaio-Do-Mar (Aquático)");
				System.out.println("3 - Pinguin (Aquático)");
				System.out.println("4 - Coruja (Voador)");
				System.out.println("0 - Voltar");
				
				int opcaoAve = Integer.parseInt(scanner.nextLine());
				
				if (opcaoAve == 0) {
					return null;
				} 
				
				System.out.print("Digite o Nome da Ave: ");
				String nome = scanner.nextLine();
				System.out.print("Digite a Idade da Ave:  ");
				int idade = Integer.parseInt(scanner.nextLine());
				System.out.print("Digite a cor das penas da Ave: ");
				String corPenas = scanner.nextLine();
				
					
				switch (opcaoAve) {
				case 1:
					return new Pato(nome, idade, corPenas);
				case 2:
					return new PapagaioDoMar(nome, idade, corPenas);
				case 3:
					return new Pinguin(nome, idade, corPenas);
				case 4:
					return new Coruja(nome, idade, corPenas);
				default:
					System.out.println("Opção Invalida!");
					return null;
				}
			
			}
			
			private static Animal cadastroReptil() {
				System.out.println("Escolha um Reptil:");
				System.out.println("1 - Crocodilo (Aquático)");
				System.out.println("2 - Dragão-Voador (Voador)");
				System.out.println("3 - Sucuri (Aquático)");
				System.out.println("4 - Tartaruga (Aquático)");
				System.out.println("0 - Voltar");
				
				int opcaoReptil = Integer.parseInt(scanner.nextLine());
				
				if (opcaoReptil == 0) {
					return null;
				} 
				
				System.out.print("Digite o Nome do Reptil: ");
				String nome = scanner.nextLine();
				System.out.print("Digite a Idade do Reptil:  ");
				int idade = Integer.parseInt(scanner.nextLine());
				
					
				switch (opcaoReptil) {
				case 1:
					return new Crocodilo(nome, idade);
				case 2:
					return new DragaoVoador(nome, idade);
				case 3:
					return new Sucuri(nome, idade);
				case 4:
					return new Tartaruga(nome, idade);
					
				default:
					System.out.println("Opção Invalida!");
					return null;
				}
			}
			
			private static void listarAnimais() {
				
				System.out.println("--- 2 Listar todos os Animais do Zoo ---");
				
				if (animais.isEmpty()) {
					System.out.println("Nenhum animal cadastrado. Cadastre um Animal para começarmos ;)");
					return;
					
				}
				
				for (Animal animal : animais) {
					System.out.println("-------------------------------------------------------------------------------");
					System.out.println("Nome: " + animal.getNome());
					System.out.println("Idade: " + animal.getIdade());
					System.out.println("Espécie: " + animal.getEspecie());
					
					animal.emitirSom();
					animal.comer();
					
					if (animal instanceof Aves) {
						System.out.println("Cor das Penas: " + ((Aves) animal).getCorPenas());
					}
					if (animal instanceof Repteis) {
						((Repteis) animal).regularTemperaturaCorporal();
					}
				
			    } 
		   }
			
			private static void listarAnimaisCorredores() {
				
				System.out.println("--- 3 Listar todos os Animais Corredores ---");
				
				int contadorCorredores = 0;
				
				for (Animal animal : animais) {
					if (animal instanceof Corredor) {
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println("Nome: " + animal.getNome() + " Espécie: " + animal.getEspecie());
					
						Corredor corredor = (Corredor) animal;
						corredor.correr();
						
						contadorCorredores++;
					}
				}
				
				if (contadorCorredores == 0) {
					System.out.println("Nenhum animal corredor cadastrado.");
				}
			}
			
			private static void listarAnimaisNadadores() {
				
				System.out.println("--- 4 Listar todos os Animais Nadadores ---");
				
				int contadorNadadores = 0;
				
				for (Animal animal : animais) {
					if (animal instanceof Nadador) {
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println("Nome: " + animal.getNome() + " Espécie: " + animal.getEspecie());
					
						Nadador nadador = (Nadador) animal;
						nadador.nadar();
						
						
						contadorNadadores++;
					}
				}
				
				if (contadorNadadores == 0) {
					System.out.println("Nenhum animal nadador cadastrado.");
				}
			}

			private static void listarAnimaisVoadores() {
				
				System.out.println("--- 5 Listar todos os Animais Voadores ---");
				
				int contadorVoadores = 0;
				
				for (Animal animal : animais) {
					if (animal instanceof Voador) {
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println("Nome: " + animal.getNome() + " Espécie: " + animal.getEspecie());
					
						Voador voador = (Voador) animal;
						voador.voar();
						
						
						contadorVoadores++;
					}
				}
				
				if (contadorVoadores == 0) {
					System.out.println("Nenhum animal voador cadastrado.");
				}
			}
			
			private static void listarAnimaisPredadores() {
				
				System.out.println("--- 6 Listar todos os Animais Predadores ---");
				
				int contadorPredadores = 0;
				
				for (Animal animal : animais) {
					if (animal instanceof Predador) {
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println("Nome: " + animal.getNome() + " Espécie: " + animal.getEspecie());
					
						Predador predador = (Predador) animal;
						predador.cacar();
						
						
						contadorPredadores++;
					}
				}
				
				if (contadorPredadores == 0) {
					System.out.println("Nenhum animal predador cadastrado.");
				}
			}
	
			private static void exibirTotalAnimais() {
				System.out.println("--- 7 Exibir total de animais Cadastrados no Zoo ---");
				
				System.out.println("O Zoo Digital possui atualmente: " + Animal.getContador() + " animais cadastrados");
			}
}
