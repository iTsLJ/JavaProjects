/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lucas
 */
public abstract class AtividadeComplementar {

    protected String descricao;
    protected float cargaHoraria;

    public AtividadeComplementar(String descricao, float cargaHoraria) {
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
    
    public abstract float calcularCreditos();

}