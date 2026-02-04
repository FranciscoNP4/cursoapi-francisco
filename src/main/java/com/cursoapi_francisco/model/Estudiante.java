package com.cursoapi_francisco.model;

public class Estudiante { //nombre apellido matricula y edad
    String nombre;
    String apellido;
    int matricula;
    int edad;
    public Estudiante(String nombre, String apellido, int matricula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }
}
