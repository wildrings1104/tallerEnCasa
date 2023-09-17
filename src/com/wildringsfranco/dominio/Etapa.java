package com.wildringsfranco.dominio;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
    private int numeroWF;
    private int tiempoWF;

    public Etapa(int numeroWF, int tiempoWF){
        this.numeroWF = numeroWF;
        this.tiempoWF = tiempoWF;
    }

    public int getNumero() {
        return this.numeroWF;
    }

    public int getTiempo() {
        return this.tiempoWF;
    }



}

