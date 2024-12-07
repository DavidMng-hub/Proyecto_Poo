/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbeat
 */
public class cls_bovinos {
    private String identificador;
    private String raza;
    private LocalDate fecha_nacimiento;
    private char sexo;
    private List<cls_vacuna> vacunas = new ArrayList<>();

    public cls_bovinos(String identificador, String raza, LocalDate fecha_nacimiento, char sexo) {
        this.identificador = identificador;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
    }
    
    //Metodo para agregar vacuna
    public void agregarVacuna(cls_vacuna vacuna) {
        vacunas.add(vacuna);
        
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public List<cls_vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(List<cls_vacuna> vacunas) {
        this.vacunas = vacunas;
    }
    
}
