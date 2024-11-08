/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author lucas
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 20, "Masculino");
        p[1] = new Pessoa("Maria", 21, "Feminino");
        
        
        l[0] = new Livro("Harry Potter", "JK Rowling", 300, p[0]);
        l[1] = new Livro("POO", "jAVA", 1000, p[1]);   
        l[2] = new Livro("Java", "jAVA", 1000, p[0]);  
        
        l[0].abrir();
        l[0].folhear(250);
        
        System.out.println(l[0].detalhes());
    }
}
