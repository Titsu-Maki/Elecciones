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
public class partidoPolitico {
    private String nombre;
    private Integer añoCreacion;
    private Integer votos;

    public partidoPolitico() {
    }

    public partidoPolitico(String nombre, Integer añoCreacion) {
        this.nombre = nombre;
        this.añoCreacion = añoCreacion;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }
    
    
    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}
