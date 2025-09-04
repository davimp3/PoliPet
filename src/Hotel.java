
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    
    ArrayList<Animal> animais;
    Scanner scanner;
    boolean controle;

        public Hotel(){
            this.animais = new ArrayList<>();
            this.scanner = new Scanner(System.in);
        }

        public void Menu(){

            while(controle){

                System.out.println("Bem vindo ao menu PoliPet, escolha uma opção:\n"+
                "1 - Adicionar Pet\n"+"2 - Listar Pets cadstrados\n"+"3 - Somar custo diário dos pets\n"+"Filtar pelos domesticáveis");
            }

        }
}
