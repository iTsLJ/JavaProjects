/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author lucas
 */
public abstract class Funcionario {

    protected String nome;
    protected double salario;
    protected double bonus;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = 0;
    }

    public abstract void bonificacao();//{
        //return this.bonus = this.salario + this.salario * 0.1 - this.salario;
    //}

    public double salarioBonus() {
        return salario = this.salario + bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
