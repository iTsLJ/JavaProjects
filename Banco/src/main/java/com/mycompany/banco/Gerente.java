/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author lucas
 */
public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
     @Override
    public String toString() {
        return "Gerente{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    @Override
    public void bonificacao(){
        System.out.println(this.bonus=this.salario+this.salario*0.25-this.salario); 
    }

   
    
}
