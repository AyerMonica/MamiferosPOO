package Mamiferos;

public class Guepardo extends Felino{

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo conocido como " + this.nombreCientifico + " tiene un tamaño de garras de " + this.tamanioGarras +
                " lo que le sirve para cazar. Suele tener una altura media de " + this.altura;
    }

    @Override
    public String dormir() {
        return "El guepardo conocido como " + this.nombreCientifico +
                " suele dormir en " + this.habitat;
    }

    @Override
    public String correr() {
        return "El guepardo conocido como " + this.nombreCientifico + " suele correr, su peso es de " + this.peso + " y su altura " + this.altura ;
    }

    @Override
    public String comunicarse() {
        return "El guepardo conocido como " + this.nombreCientifico + " se comunica gracias a su potencia de rugido";
    }
}
