public class Passaro extends Animal implements Domesticavel{
    private double diaria = 30.00;
    private boolean raro = false;
    
    public Passaro(String nome, double peso, String emitirSom, boolean adestrado) {
        super(nome, peso);
    }

    @Override
    public String emitirSom(){
        return "Piá";
    }

    @Override
    public double calcularDiaria(){
        double soma = 0.0;
        if(raro != false ){
               soma = diaria+(0.1*getPeso())+5; 
        } else {
            soma = diaria+(0.1*getPeso());
        }
        return soma;
    }

    @Override
    public String interagir(){
        return "O passaro voa";
    }

    @Override
    public boolean precisaPassear(){
        return false;
    }
    
}


