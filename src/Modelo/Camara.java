/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Camara extends Candidato {

    public int numero;
    public Departamento departamento;
    public static String nombre = "CAMARA DE REPRESENTANTES";

    public Camara() {
    }

    public Camara(int numero, Departamento departamento) {
        this.numero = numero;
        this.departamento = departamento;
    }

    public Camara(int numero, Departamento departamento, String nombre, int CC, String email, char genero, double numeroTelefono, partidoPolitico partido, int numeroCandidato, int votos) {
        super(nombre, CC, email, genero, numeroTelefono, partido, numeroCandidato);
        this.departamento = departamento;
        if (numero >= 101 && numero <= (100 + departamento.getNumeroCurulCamara())) {
            this.numero = numero;
        } else {
            System.out.println("Error en el numero del candidato");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void perteneceCamara(int numero) {
        if (numero > 100 && numero <= (101 + departamento.getNumeroCurulCamara())) {
            System.out.println("El numero del representante a la camara es valido");
        } else {
            System.out.println("Número no válido para participar en la cámara.");
        }

    }

}
