
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    
    private ArrayList<Animal> animais;
    private Scanner scanner;
    private String registroAnimal;
    private double pesoAnimal;
    private  String adest;

    
    int caso;

        public Hotel(){
            this.animais = new ArrayList<>();
            this.scanner = new Scanner(System.in);
        }

        public void Menu(){

            while(true){

                System.out.println("Bem vindo ao menu PoliPet, escolha uma opção:\n"+
                "1 - Adicionar Cachorro\n"+" 2 Adicionar Gato\n"+"3 - Adicionar Pássaro\n"+"4 - Listar Pets cadstrados\n"+"5 - Somar custo diário dos pets\n"+" 6- Filtar pelos domesticáveis\n"+" 0 - Sair do Sistema");
                    caso = scanner.nextInt();
                    scanner.nextLine();


            switch (caso){
                    case 0->{
                        System.out.println("Saindo do sistema...");
                        return;
                    }

                    case 1->{
                        System.out.println("Digite o nome:");
                        registroAnimal = scanner.nextLine();
                        
                        System.out.println("Digite o peso:");
                        pesoAnimal = scanner.nextDouble();
                        scanner.nextLine();
                        
                        System.out.println("O cachorro é adestrado [S/N]?");
                        adest = scanner.nextLine();
                        boolean adestrado = adest.equalsIgnoreCase("S");

                        Cachorro novCachorro = new Cachorro(registroAnimal, pesoAnimal, adestrado);

                        animais.add(novCachorro);

                    }


                    case 2->{
                        System.out.println("Digite o nome:");
                    }

                    case 3->{
                        System.out.println("Digite o nome:");
                    }

                    case 4->{
                        System.out.println("LIsta de Pets cadastrados:");
                    }

                    case 5->{
                        System.out.println("Custo diário dos Pets");
                    }

                    case 6->{
                        System.out.println("Lista de Pets domesticáveis:");
                    }
                    default->{
                        System.out.println("Opção inválida, selecione uma das opçoes acima!");
                    }
            }                                
            }
        }
}

