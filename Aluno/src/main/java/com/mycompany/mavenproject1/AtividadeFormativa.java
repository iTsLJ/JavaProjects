/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lucas
 */
public class AtividadeFormativa extends AtividadeComplementar {

    public AtividadeFormativa(String descricao, float cargaHoraria) {
        super(descricao, cargaHoraria);
    }

    public float calcularCreditos() {
        return this.cargaHoraria / 30;
    }

}
