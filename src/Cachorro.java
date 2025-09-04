public class Cachorro extends Animal implements Domesticavel {
    private boolean adestrado = false;
    private double diaria = 50;

    public Cachorro(String nome, double peso, boolean adestrado) {
        super(nome, peso);
        this.adestrado = adestrado;
    }

    @Override
    public String emitirSom(){
        return "au-au";
    }

    @Override
    public double calcularDiaria(){
        double soma =0.0;
            if(!(adestrado)){
                soma = diaria+10+(0.5*getPeso());
            } else {
                soma = 50+(0.5*getPeso());
            }
        return soma;
    }

    @Override
    public String interagir(){
        return "O cachorro abana o rabo";
    }

    @Override
    public boolean precisaPassear(){
        return true;
    }
}





