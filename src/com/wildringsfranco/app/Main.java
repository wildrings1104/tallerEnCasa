package com.wildringsfranco.app;

import com.wildringsfranco.dominio.Competencia;
import com.wildringsfranco.dominio.Corredor;
import com.wildringsfranco.dominio.Equipo;
import com.wildringsfranco.dominio.Etapa;

public class Main  {

    public static void main(String[] args) {

        Competencia competencia = new Competencia();


        Equipo equipo1 = new Equipo("Equipo 1");
        equipo1.agregarCorredor(new Corredor("Corredor1"));
        equipo1.agregarCorredor(new Corredor("Corredor2"));
        equipo1.agregarCorredor(new Corredor("Corredor3"));
        equipo1.agregarCorredor(new Corredor("Corredor4"));
        equipo1.agregarCorredor(new Corredor("Corredor5"));

        Equipo equipo2 = new Equipo("Equipo 2");
        equipo2.agregarCorredor(new Corredor("Corredor1"));
        equipo2.agregarCorredor(new Corredor("Corredor2"));
        equipo2.agregarCorredor(new Corredor("Corredor3"));
        equipo2.agregarCorredor(new Corredor("Corredor4"));
        equipo2.agregarCorredor(new Corredor("Corredor5"));

        Equipo equipo3 = new Equipo("Equipo 3");
        equipo3.agregarCorredor(new Corredor("Corredor1"));
        equipo3.agregarCorredor(new Corredor("Corredor2"));
        equipo3.agregarCorredor(new Corredor("Corredor3"));
        equipo3.agregarCorredor(new Corredor("Corredor4"));
        equipo3.agregarCorredor(new Corredor("Corredor5"));

        Equipo equipo4 = new Equipo("Equipo 4");
        equipo4.agregarCorredor(new Corredor("Corredor1"));
        equipo4.agregarCorredor(new Corredor("Corredor2"));
        equipo4.agregarCorredor(new Corredor("Corredor3"));
        equipo4.agregarCorredor(new Corredor("Corredor4"));
        equipo4.agregarCorredor(new Corredor("Corredor5"));

        Equipo equipo5 = new Equipo("Equipo 5");
        equipo5.agregarCorredor(new Corredor("Corredor1"));
        equipo5.agregarCorredor(new Corredor("Corredor2"));
        equipo5.agregarCorredor(new Corredor("Corredor3"));
        equipo5.agregarCorredor(new Corredor("Corredor4"));
        equipo5.agregarCorredor(new Corredor("Corredor5"));



        Etapa etapa1 = new Etapa(1, 120);
        Etapa etapa2 = new Etapa(2, 90);
        Etapa etapa3 = new Etapa(3, 220);
        Etapa etapa4 = new Etapa(4, 410);
        Etapa etapa5 = new Etapa(5, 190);
        Etapa etapa6 = new Etapa(6, 500);
        Etapa etapa7 = new Etapa(7, 320);
        Etapa etapa8 = new Etapa(8, 280);
        Etapa etapa9 = new Etapa(9, 154);
        Etapa etapa10 = new Etapa(10, 170);

        competencia.agregarEquipo(equipo1);
        competencia.agregarEquipo(equipo2);
        competencia.agregarEquipo(equipo3);
        competencia.agregarEquipo(equipo4);
        competencia.agregarEquipo(equipo5);

        competencia.agregarEtapa(etapa1);
        competencia.agregarEtapa(etapa2);
        competencia.agregarEtapa(etapa3);
        competencia.agregarEtapa(etapa4);
        competencia.agregarEtapa(etapa5);
        competencia.agregarEtapa(etapa6);
        competencia.agregarEtapa(etapa7);
        competencia.agregarEtapa(etapa8);
        competencia.agregarEtapa(etapa9);
        competencia.agregarEtapa(etapa10);


    }
}