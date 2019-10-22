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
public class CalculadoraPostfix {
    
    private LinkStack ls;

    public CalculadoraPostfix() {
        this.ls = new LinkStack<String>();
    }
    
    public void addcarateres(String s){
        ls.push(s);
    }
    
    public void operacao(){
        double a = 0;
        double b = 0;
        double conta = 0;
        while(ls.size() != 1){
            a = Double.parseDouble(String.valueOf(ls.pop()));
            b = Double.parseDouble(String.valueOf(ls.pop()));
            if(ls.pop().equals("*")){
                conta = a*b;
                ls.push((double) conta);
            } else {
                if(ls.pop().equals("/")){
                    conta = a/b;
                    ls.push((double) conta);
                    }
                else{
                    if(ls.pop().equals("+")){
                        conta = a+b;
                        ls.push((double) conta);
                    }
                    else{
                        if(ls.pop().equals("-")){
                            conta = a-b;
                            ls.push((double) conta);
                        }
                    }
                }
            }
            
        }
        
        System.out.println(ls.pop());
        
    }
    
    
    
}
