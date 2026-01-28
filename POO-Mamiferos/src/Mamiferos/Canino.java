package Mamiferos;

abstract public class Canino extends Mamifero{

    protected String color;
    protected double tamanioComillo;

    public Canino (String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioComillo){
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioComillo = tamanioComillo;
    }

    public double getTamanioComillo() {
        return tamanioComillo;
    }

    public String getColor() {
        return color;
    }

}
