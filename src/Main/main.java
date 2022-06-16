/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Modelo.Camara;
import Modelo.Candidato;
import Modelo.Departamento;
import Modelo.partidoPolitico;
/**
 *
 * @author estudiante
 */
public class main {
    public static void main(String[] args) {
        Departamento departamento1 = new Departamento (1,"Cundinamarca",3);
        partidoPolitico partido1 = new partidoPolitico("Pacto Historico", 1992);
        Camara cam1 = new Camara(101, departamento1);
        Candidato candidato1 = new Candidato("Petro",1094282914,"petro@gmail.com",'M',314345622, partido1, cam1.getNumero() );
        
        Departamento departamento2 = new Departamento (2,"Santander",3);
        partidoPolitico partido2 = new partidoPolitico("Liga de Gobernantes Anticorrupcion", 1993);
        Camara cam2 = new Camara(102, departamento2);
        Candidato candidato2 = new Candidato("Rodolfo",1054282916,"rodolfo@gmail.com",'M',315345622, partido2, cam1.getNumero() );
        
        System.out.println();
        
        candidato1.imprimir();
        cam1.perteneceCamara(candidato1.getNumeroCandidato());
           
        System.out.println();
        
        candidato2.imprimir();
        cam1.perteneceCamara(candidato2.getNumeroCandidato());
        
        
    }
    

}
