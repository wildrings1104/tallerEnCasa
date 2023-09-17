package com.wildringsfranco.dominio;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    public String nombreWF;
    public int puntosWF;
    private List<Corredor> corredoresWF;
    public Equipo(String nombreWF) {
        this.nombreWF = nombreWF;
        this.corredoresWF = new ArrayList<>();
    }


    public void agregarCorredor(Corredor corredor) {
        if (corredoresWF.size() < 5) {
            corredoresWF.add(corredor);
        } else {
            System.out.println("No se puede agregar el corredor, se alcanzó el límite de 5 corredores.");
        }
    }
    public String getNombreWF() {
        return nombreWF;
    }
    public List<Corredor> getCorredoresWF() {
        return corredoresWF;
    }

    public int getPuntosWF() {
        return puntosWF;
    }

    public void setPuntosWF(int puntosWF) {
        this.puntosWF = puntosWF;
    }
}

