package Mamiferos;

public class Tigre extends Felino{

    private String especieTigre;


    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre conocido como " + this.nombreCientifico + " y nombre de especie " + this.especieTigre +
                " tiene un tamaño de garras de " + this.tamanioGarras + "cm lo que le sirve para cazar";
    }

    @Override
    public String dormir() {
        return "El tigre conocido como " + this.nombreCientifico +
                " suele dormir en " + this.habitat;
    }

    @Override
    public String correr() {
        return "El tigre conocido como " + this.nombreCientifico + " suele correr, su peso es de " + this.peso + "Kg y su altura " + this.altura + "m";
    }

    @Override
    public String comunicarse() {
        return "El tigre conocido como " + this.nombreCientifico + " se comunica gracias a su potencia de rugido";
    }
}
