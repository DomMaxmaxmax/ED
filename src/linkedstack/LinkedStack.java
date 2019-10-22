/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstack;

/**
 *
 * @author PC
 */
public class LinkedStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LinkStack<String> ls = new LinkStack();
//        System.out.println("--------Primeiro Teste------");
//        ls.push("Tiago");
//        ls.push("Bruno");
//        ls.peek();
//        System.out.println(ls.size());
//        System.out.println("--------Segundo Teste-------");
//        System.out.println(ls.pop());
//        System.out.println(ls.size());
//        System.out.println("--------Terceiro Teste------");
//        ls.isEmpty();
//        System.out.println("--------Quarto Teste--------");
//        ls.peek();

          CalculadoraPostfix cp = new CalculadoraPostfix();
          cp.addcarateres("1");
          cp.addcarateres("2");
          cp.addcarateres("+");
          cp.operacao();
          
    }
    
}
