package Mamiferos;

abstract public class Felino extends Mamifero {

    protected double tamanioGarras;
    protected int velocidad;

    public Felino (String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad){
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public double getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

}
