import juego.Carrera;
import juego.Coche;
import juego.Reloj;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("coche");
        Coche coche2 = new Coche("coche2");
        Coche coche3 = new Coche("coche3");
        Coche coche4 = new Coche("coche4");
        Coche coche5 = new Coche("coche5");
        Coche coche6 = new Coche("coche6");

        Carrera carrera = new Carrera();
        carrera.addCoche(coche1);
        carrera.addCoche(coche2);
        carrera.addCoche(coche3);
        carrera.addCoche(coche4);
        carrera.addCoche(coche5);
        carrera.addCoche(coche6);

        carrera.comenzarCarrera(true);

        Reloj tiempoCoche1 = new Reloj(0, 30, 60);
        Reloj tiempoCoche2 = new Reloj(0, 30, 10);
        Reloj tiempoCoche3 = new Reloj(0, 31, 5);
        Reloj tiempoCoche4 = new Reloj(0, 30, 11);
        Reloj tiempoCoche5 = new Reloj(0, 30, 9);
        Reloj tiempoCoche6 = new Reloj(0, 31, 10);

        carrera.registrarTiempoVueltaCoche(tiempoCoche1, "coche");
        carrera.registrarTiempoVueltaCoche(tiempoCoche2, "coche2");
        carrera.registrarTiempoVueltaCoche(tiempoCoche3, "coche3");
        carrera.registrarTiempoVueltaCoche(tiempoCoche4, "coche4");
        carrera.registrarTiempoVueltaCoche(tiempoCoche5, "coche5");
        carrera.registrarTiempoVueltaCoche(tiempoCoche6, "coche6");

        carrera.terminarCarrera();
    }
    
}
