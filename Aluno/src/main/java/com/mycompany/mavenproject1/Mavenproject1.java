/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        // Criando algumas atividades complementares
        AtividadeComplementar atividade1 = new AtividadeFormativa("Curso de Java", 60); // 2 créditos
        AtividadeComplementar atividade2 = new AtividadeExtensionista("Palestra sobre Tecnologia", 30); // 2 créditos
        AtividadeComplementar atividade3 = new AtividadeMonitoria("Monitoria em Matemática", 40); // 2 créditos
        
        // Lista de atividades do aluno
        List<AtividadeComplementar> atividades = new ArrayList<>();
        atividades.add(atividade1);
        atividades.add(atividade2);
        atividades.add(atividade3);
        
        // Criando um curso
        Curso curso = new Curso("Ciência da Computação", "CC101");
        
        // Criando um aluno com suas atividades complementares
        Aluno aluno = new Aluno("Lucas", "123456", curso, atividades);
        
        // Calculando os créditos totais do aluno
        float totalCreditos = aluno.calcularCreditos();
        
        // Exibindo o total de créditos
        System.out.println("Total de créditos acumulados: " + totalCreditos);
    }
}


