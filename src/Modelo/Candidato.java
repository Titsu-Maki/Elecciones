/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Camara;

/**
 *
 * @author estudiante
 */
public class Candidato {

    private String nombre;
    private int CC;
    private String email;
    private char genero;
    private double numeroTelefono;
    private partidoPolitico partido;
    private int numeroCandidato;
    private int votos;

    public Candidato() {
    }

    public Candidato(String nombre, int CC, String email, char genero, double numeroTelefono, partidoPolitico partido, int numeroCandidato) {
        this.nombre = nombre;
        this.CC = CC;
        this.email = email;
        this.genero = genero;
        this.numeroTelefono = numeroTelefono;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public partidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(partidoPolitico partido) {
        this.partido = partido;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public double getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(double numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    
    public int calcularTotalVotos() {
        return votos;
    }

    public void imprimir() {
        if (numeroCandidato > 0 && numeroCandidato <=100) {
            String nombreEstado = Senado.nombre;
            System.out.println(nombreEstado+"\n"
                    + "Partido politico: " +partido.getNombre()+ ".\n"
                    + "Nombre: " +nombre+ ".\n"
                    + "Documento: " +CC+ ".\n"
                    + "Email: " +email+ ".\n"
                    + "Numero: " +numeroCandidato+ ".\n");
        } else if(numeroCandidato > 100 && numeroCandidato <=105) {
            String nombreEstado = Camara.nombre;
            System.out.println(nombreEstado+"\n"
                    + "Partido politico: " +partido.getNombre()+ ".\n"
                    + "Nombre: " +nombre+ ".\n"
                    + "Documento: " +CC+ ".\n"
                    + "Email: " +email+ ".\n"
                    + "Numero: " +numeroCandidato+ ".\n");
        }
        
    }
}
