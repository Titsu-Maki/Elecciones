/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Manuel
 */
public class Elecciones {

    private List<Candidato> candidatos;
    private List<Camara> candidatosCamara;
    private List<Senado> candidatosSenado;
    private Integer totalVotosSenado;
    private Integer totalVotosCamara;
    private Integer totalVotosPartido;

    public void registrarCandidato(Candidato candidato) {
        if (candidato.getNumeroCandidato() > 0
                && candidato.getNumeroCandidato() <= 100) {
            candidato = new Senado();
            candidatos.add(candidato);
            candidatosSenado.add((Senado) candidato);
        } else if (candidato.getNumeroCandidato() > 100
                && candidato.getNumeroCandidato() <= 105) {
            candidato = new Camara();
            candidatos.add(candidato);
            candidatosCamara.add((Camara) candidato);
        }
    }

    public void registrarVotosCandidato(int votos, Candidato candidato) {
        candidato.setVotos(votos);
    }

    public void registrarVotosCorporacion(int votos, partidoPolitico partido) {
        partido.setVotos(votos);
    }

    public void votarCandidato(Candidato candidato) {
        candidato.setVotos(candidato.getVotos() + 1);
    }

    public void votaarPartido(partidoPolitico partido) {
        partido.setVotos(partido.getVotos() + 1);
    }

    public float porcentajeVotos(Candidato candidato) {
        float porcentaje = 0;
        if (candidato.getNumeroCandidato() > 0
                && candidato.getNumeroCandidato() <= 100) {
            porcentaje = candidato.getVotos() * 100 / totalVotosSenado;
            System.out.println("El porcentaje de votos de "
                    + candidato.getNombre() + " es: " + porcentaje + "%");
            return porcentaje;
        } else if (candidato.getNumeroCandidato() > 100
                && candidato.getNumeroCandidato() <= 105) {
            porcentaje = candidato.getVotos() * 100 / totalVotosCamara;
            System.out.println("El porcentaje de votos de "
                    + candidato.getNombre() + " es: " + porcentaje + "%");
            return porcentaje;
        } else {
            System.out.println("El candidato " + candidato.getNombre() + " no tiene votos");
        }
        return porcentaje;
    }
}
