/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author lucas
 */
public class Secretaria extends Funcionario {

    private String numeroRamal;

    public Secretaria(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonificacao(){
        this.bonus=this.salario+this.salario*0.15-this.salario;
    }

    @Override
    public String toString() {
        return "Secretaria{" + "nome=" + nome + ", salario=" + salario + '}';
    }
}
