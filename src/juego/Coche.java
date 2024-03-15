package juego;

public class Coche {
    private String nombre;
    private Reloj tiempoVuelta;

    public Coche(String nombre){
        this.nombre = nombre;
        this.tiempoVuelta = new Reloj();
    }

    public String getNombre() {
        return nombre;
    }

    public Reloj getTiempoVuelta() {
        return tiempoVuelta;
    }

    public void setTiempoVuelta(Reloj tiempoVuelta) {
        this.tiempoVuelta = tiempoVuelta;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nTiempo de vuelta: " + this.tiempoVuelta;
    }
}
