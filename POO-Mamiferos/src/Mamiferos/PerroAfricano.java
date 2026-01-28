package Mamiferos;

public class PerroAfricano extends Canino{

    private int fuerzaMordida;


    public PerroAfricano(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioComillo, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioComillo);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro Africano conocido como " + this.nombreCientifico +
                " posee una fuerza de mordida de " + this.fuerzaMordida + "PSI y con tamaño de colmillo " + this.tamanioComillo +
                " lo que le sirve para comer";
    }

    @Override
    public String dormir() {
        return "El perro Africano conocido científicamente como " + this.nombreCientifico + " suele dormir en"
                + this.habitat + " y tiene un pelaje de color " + this.color;
    }

    @Override
    public String correr() {
        return "El perro Africano conocido científicamente como " + this.nombreCientifico + " suele correr por " + this.habitat;
    }

    @Override
    public String comunicarse() {
        return "El perro Africano conocido científicamente como " + this.nombreCientifico + " se comunica. Además tiene una altura media de "
                + this.altura + " un largo medio de " + this.largo + " y un peso medio de " + this.peso;
    }
}
