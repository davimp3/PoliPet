public class Gato extends Animal implements  Domesticavel {

    private double diaria = 40.0;
    
    public Gato(String nome, double peso, boolean adestrado) {
        super(nome, peso);
    }
    @Override
    public String emitirSom(){
        return "miau";
    }
    @Override
    public double calcularDiaria() {
        double soma = 0;
        soma = diaria+(0.3*getPeso());
        return soma;
        
    }
    
    @Override
    public String interagir(){
        return "O gato ronrona";
    }

    @Override
    public boolean precisaPassear(){
        return false;
    }
}
