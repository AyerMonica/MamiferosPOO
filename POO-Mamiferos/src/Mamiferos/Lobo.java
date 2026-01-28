package Mamiferos;

public class Lobo extends Canino {

    private int numeroManada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioComillo, int numeroManada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioComillo);
        this.numeroManada = numeroManada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo conocido como " + this.nombreCientifico +
                " cuya especie es " + this.especieLobo + " con tamaño de colmillo " +
                this.tamanioComillo + "cm, suele cazar en manadas de " + this.numeroManada + " individuos";
    }

    @Override
    public String dormir() {
        return "El lobo conocido como " + this.nombreCientifico +
                " cuya especie es " + this.especieLobo + " suele dormir en " + this.habitat;
    }

    @Override
    public String correr() {
        return "El lobo conocido como " + this.nombreCientifico + " suele correr, su peso es de " + this.peso + " y su altura " + this.altura ;
    }

    @Override
    public String comunicarse() {
        return "El lobo conocido como " + this.nombreCientifico + " se comunica";
    }


}
