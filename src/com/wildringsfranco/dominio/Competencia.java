package com.wildringsfranco.dominio;

import javax.swing.*;
import java.util.*;

import static java.util.Arrays.compare;

public class Competencia {
    private List<Equipo> equiposWF;
    private List<Etapa> etapasWF;
    public Competencia() {
        equiposWF = new ArrayList<>();
        etapasWF = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        if (equiposWF.size() < 5) {
            equiposWF.add(equipo);
        } else {
            System.out.println("La competencia ya tiene 5 equipos, no se puede agregar más.");
        }
    }public void agregarEtapa(Etapa etapa) {
        if (etapasWF.size() < 10) {
            etapasWF.add(etapa);
        } else {
            System.out.println("La competencia ya tiene 10 etapas, no se puede agregar más.");
        }
    }

    public List<Equipo> getEquiposWF() {
        return equiposWF;
    }

    public List<Etapa> getEtapasWF() {
        return etapasWF;
    }
    public void calcularPuntos() {
        Iterator v1 = this.equiposWF.iterator();

        int puntosWF = 0;
        Equipo equipo = null;
        while (v1.hasNext()) {
            equipo = (Equipo) v1.next();
            puntosWF = 0;
        }
        int tiempoEtapa = 0;
        for (Iterator v2 = this.etapasWF.iterator(); v2.hasNext(); puntosWF += 100 - tiempoEtapa) {
            Etapa etapa = (Etapa) v2.next();
            tiempoEtapa = etapa.getTiempo();
        }
        equipo.setPuntosWF(puntosWF);
    }
    public void mostrarTablaPocisiones(){
        this.calcularPuntos();
        List<Equipo> equiposConPuntos = new ArrayList<>(this.equiposWF);
        Collections.sort(equiposConPuntos, compare(equipo1, equipo2) -> {
            return Integer.compare(equipo2.getPuntosWF(), equipo1.getPuntosWF() );
        }
        System.out.println("Top 10: ");

        for (int i = 0; i < Math.min(10, equiposConPuntos.size());  ++ i){
            Equipo equipo = (Equipo)equiposConPuntos.get(i);
            System.out.println(i + 1 + "."+ equipo.getNombreWF() + " = Puntos" + equipo.getPuntosWF());

        }
    }

}

