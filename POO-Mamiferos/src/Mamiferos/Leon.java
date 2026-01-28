package Mamiferos;

public class Leon extends Felino{
    private int numeroManada;
    private double potenciaRugido;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, int numeroManada, double potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El león conocido como " + this.nombreCientifico +
                " suele vivir en manadas de " + this.numeroManada + " individuos. Tienen un tamaño de garras de " + this.tamanioGarras +
                "cm lo que le sirve para cazar a una velocidad de " + this.velocidad + "km/h";
    }

    @Override
    public String dormir() {
        return "El león conocido como " + this.nombreCientifico +
                 " suele dormir en " + this.habitat;
    }

    @Override
    public String correr() {
        return "El león conocido como " + this.nombreCientifico + " suele correr, su peso es de " + this.peso + "kg y su altura " + this.altura + "m";
    }

    @Override
    public String comunicarse() {
        return "El león conocido como " + this.nombreCientifico + " se comunica gracias a su potencia de rugido de "
                + this.potenciaRugido + "decibelios";
    }
}
