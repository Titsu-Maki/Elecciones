/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Manuel
 */
public class Senado extends Candidato {

    public static String nombre = "SENADO";

    public Senado() {
    }

    public Senado(String nombre, int CC, String email, char genero, double numeroTelefono, partidoPolitico partido, int numeroCandidato, int votos) {
        super(nombre, CC, email, genero, numeroTelefono, partido, numeroCandidato);
      
    }


    public String perteneceSenado(int numero) {
        String numeroSenado = "";
        if (super.getNumeroCandidato() > 0 && super.getNumeroCandidato() <= 100) {
            numeroSenado = "El numero del representante al senado es valido";
        }else{
            System.out.println("El numero del candidato no se ha encontrado");
        }
        return numeroSenado;
    }

}
