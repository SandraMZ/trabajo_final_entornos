package juego;

import java.util.ArrayList;

public class Carrera {
    private Reloj tiempoInicio;
    private boolean enCurso;
    private ArrayList<Coche> coches;

    //constructor
    public Carrera(){
        this.tiempoInicio = new Reloj();
        this.enCurso = false;
        this.coches = new ArrayList<Coche>();
    }

    public boolean isEnCurso() {
        return enCurso;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    //método para comenzar la carrera
    public void comenzarCarrera(boolean comenzar) {
        if(comenzar){
            this.enCurso = comenzar;
        }
    }

    //método para terminar la carrera y clasificar los coches
    public void terminarCarrera(){
        if(this.enCurso){
            this.enCurso = false;
            for (int f = 0; f < coches.size(); f++) {
                for (int i = 0; i < coches.size() - 1; i++) {
                    Coche coche1 = coches.get(i);
                    Coche coche2 = coches.get(i + 1);
    
                    if(coche1.getTiempoVuelta().getHoras() > coche2.getTiempoVuelta().getHoras()){
                        coches.set(i + 1, coche1);
                        coches.set(i, coche2);
                    } else if(coche1.getTiempoVuelta().getHoras() == coche2.getTiempoVuelta().getHoras()){
                        if(coche1.getTiempoVuelta().getMinutos() > coche2.getTiempoVuelta().getMinutos()){
                            coches.set(i + 1, coche1);
                            coches.set(i, coche2);
                        } else if(coche1.getTiempoVuelta().getMinutos() == coche2.getTiempoVuelta().getMinutos()){
                            if (coche1.getTiempoVuelta().getSegundos() > coche2.getTiempoVuelta().getSegundos()) {
                                coches.set(i + 1, coche1);
                                coches.set(i, coche2);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Clasificación:");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println((i + 1) + " - " + coches.get(i));
        }
    }

    //método para añadir coches
    public void addCoche(Coche coche){
        this.coches.add(coche);
    }

    //método para registrar el tiempo de vuelta del coche
    public void registrarTiempoVueltaCoche(Reloj tiempoVuelta, String nombreCoche){
        for (int i = 0; i < coches.size(); i++) {
            if(coches.get(i).getNombre().equals(nombreCoche)){
                coches.get(i).setTiempoVuelta(tiempoVuelta);
            }
        }
    }

}
