/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.banco;

/**
 *
 * @author lucas
 */
public class Test {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Lucas", 5000);
        Secretaria secretaria = new Secretaria("Julia", 2500);
        Telefonista telefonista = new Telefonista("Giovana", 1400);

        gerente.bonificacao();
        
        
        /*System.out.println("\n" + gerente);
        System.out.println("Bonificação Gerente: " + gerente.bonificacao());
        System.out.println("Salario com Bonificação Gerente: " + gerente.salarioBonus());
        
        System.out.println("\n" + secretaria);
        System.out.println("Bonificação Secretaria: " + secretaria.bonificacao());
        System.out.println("Salario com Bonificação Secretaria: " + secretaria.salarioBonus());
        
        System.out.println("\n" + telefonista);
        System.out.println("Bonificação Tlefonista: " + telefonista.bonificacao());
        System.out.println("Salario com Bonificação Tlefonista: " + telefonista.salarioBonus());
*/
    }

}
