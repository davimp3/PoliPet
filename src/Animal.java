public abstract class Animal {
    
    private String nome;
    private double peso;
    private String emitirSom;
    
    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString(){
        String info = "Animal";
        info += "Nome:"+getNome() + ",";
        info += "Peso:"+getPeso() + ", ";
        return info;
    }

    public abstract double calcularDiaria();
    
    public abstract String emitirSom();


}