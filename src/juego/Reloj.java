package juego;

import java.text.DecimalFormat;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(){
        this.horas= 0;
        this.minutos = 0;
        this.segundos=0;
    }

    public Reloj(int horas, int minutos, int segundos){
        if(validarHora(horas)){
            this.horas = horas;
        } else{
            this.horas = 0;
        }

        if (validarMinuto(minutos)){
            this.minutos = minutos;
        }else{
            this.minutos = minutos - 60;
            this.horas++;
        }

        if (validarSegundo(segundos)) {
            this.segundos = segundos;
        } else{
            this.segundos = segundos - 60;
            this.minutos++;
        }

    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        if(validarHora(horas)){
            this.horas = horas;
        } else{
            this.horas = 0;
        }
    }

    public void setMinutos(int minutos) {
        if (validarMinuto(minutos)){
            this.minutos = minutos;
        }else{
            this.minutos = minutos - 60;
            this.horas++;
        }
    }

    public void setSegundos(int segundos) {
        if (validarSegundo(segundos)) {
            this.segundos = segundos;
        } else{
            this.segundos = segundos - 60;
            this.minutos++;
        }
    }

    public boolean modificarHora(int hora, int minutos, int segundos) {

        boolean correcto = true;

        if(validarHora(horas)){
            this.horas = horas;
        } else{
            correcto = false;
        }


        if (validarMinuto(minutos)){
            this.minutos = minutos;
        }else{
            correcto = false;
        }


        if (validarSegundo(segundos)) {
            this.segundos = segundos;
        } else{
            correcto = false;
        }
        return  correcto;
    }

    public void sumarSegundo() {
        this.segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.minutos++;
            if (this.minutos == 60) {
                this.minutos = 0;
                this.horas++;
                if (this.horas == 24) {
                    this.horas = 0;
                }
            }
        }
    }

    public void sumarSegundos(int segundos) {
        this.segundos += segundos;
        if(this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos++;
            if (this.minutos == 60) {
                this.minutos = 0;
                this.horas++;
                if (this.horas == 24) {
                    this.horas = 0;
                }
            }
        }
    }


    private boolean validarHora(int hora) {
        return hora >= 0 && hora < 24;
    }

    private boolean validarMinuto(int minuto) {
        return minuto >= 0 && minuto < 60;
    }

    private boolean validarSegundo(int segundo) {
        return segundo >= 0 && segundo < 60;
    }


    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("00");
        return formato.format(this.horas) + ":" + formato.format(this.minutos) + ":" + formato.format(this.segundos);
    }
}
