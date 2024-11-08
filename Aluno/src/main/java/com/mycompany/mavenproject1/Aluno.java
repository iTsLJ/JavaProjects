/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.List;

/**
 *
 * @author lucas
 */
public class Aluno {
    private String nome;
    private String numMatricula;
    private Curso curso;
    private List<AtividadeComplementar> atividades;

    public Aluno(String nome, String numMatricula, Curso curso, List<AtividadeComplementar> atividades) {
        this.nome = nome;
        this.numMatricula = numMatricula;
        this.curso = curso;
        this.atividades = atividades;
    }
    
    public float calcularCreditos(){
        float totalCreditos = 0;
        
        for (AtividadeComplementar atividade: atividades) {
            totalCreditos += atividade.calcularCreditos();
        }
        return totalCreditos;
    }
    
}
