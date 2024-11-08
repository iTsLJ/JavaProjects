/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author lucas
 */
public class Telefonista extends Funcionario {

    private int codigo;

    public Telefonista(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public String toString() {
        return "Telefonista{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    @Override
    public void bonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
