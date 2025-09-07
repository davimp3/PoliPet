
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    
    private ArrayList<Animal> animais;
    private Scanner scanner;
    private String registroAnimal;
    private double pesoAnimal;
    private  String adest;
    private  String raro; 
    private String listaAnimais;  
    int caso;

        public String getRegistroAnimal() {
        return registroAnimal;
    }

    public void setRegistroAnimal(String registroAnimal) {
        this.registroAnimal = registroAnimal;
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

        public Hotel(){
            this.animais = new ArrayList<>();
            this.scanner = new Scanner(System.in);
        }

        public void Menu(){

            while(true){
                System.out.println("Bem vindo ao menu PoliPet, escolha uma opção:\n"+
                "1 - Adicionar Cachorro\n"+"2 - Adicionar Gato\n"+"3 - Adicionar Pássaro\n"+"4 - Listar Pets cadstrados\n"+"5 - Filtar pelos domesticáveis\n"+"0 - Sair do Sistema");
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

                        Cachorro novoCachorro = new Cachorro(registroAnimal, pesoAnimal, adestrado);

                        System.out.println("Custo diária:"+novoCachorro.calcularDiaria());
                        animais.add(novoCachorro);
                    }

                    case 2->{
                        System.out.println("Digite o nome:");
                        registroAnimal = scanner.nextLine();

                        System.out.println("Digite o peso:");
                        pesoAnimal = scanner.nextDouble();

                        Gato novoGato = new Gato(adest, pesoAnimal, false);
                        animais.add(novoGato);

                        System.out.println("Custo Diária:"+novoGato.calcularDiaria());
                        animais.add(novoGato);
                    }

                    case 3->{
                        System.out.println("Digite o nome:");
                        registroAnimal = scanner.nextLine();

                        System.out.println("Digite o peso:");
                        pesoAnimal = scanner.nextDouble();

                        System.out.println("O pássaro é raro? S/N");
                        raro = scanner.nextLine();
                        boolean raridade = raro.equalsIgnoreCase(("S"));

                        Passaro novoPassaro = new Passaro(raro, pesoAnimal, adest, raridade);
                        animais.add(novoPassaro);
                    }

                    case 4->{                       
                        System.out.println("Lista de Pets cadastrados:\n"+animais);
                         for(Animal listaAnimal: animais){
                            System.out.println(listaAnimal);
                        }
                    }

                    case 5->{
                        System.out.println("Lista de Pets domesticáveis:");
                    }
                    default->{
                        System.out.println("Opção inválida, selecione uma das opçoes acima!");
                    }
            }                                
            }
        }
}

