/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopilhas_bruno;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Pilha {
    //Atributos
    int [] pilha = new int[10]; //pilha
    int topoPilha = -1; //indica onde está o topo da pilha
    
    //Métodos
    int esvazie_pilha(){
        this.topoPilha = -1;
        return(this.topoPilha);
    }
    
    int tamanho(){
        return(this.topoPilha+1);
    }
    
    void imprimir(int topo){ //void = procedimento
        for(int i = topo; i>=0; i--){
            System.out.println("Valor na pilha: "+this.pilha[i]);
        }
    }
    
    int push(int topo, int num){
        this.topoPilha = topo;
        this.topoPilha++;
    
    if(this.topoPilha < 0){
            this.topoPilha = 0;
        }
    
    if(this.topoPilha > 9){
        JOptionPane.showMessageDialog(null,"Estouro de pilha! Erro -999");
        return(this.topoPilha--);
    }else{
        this.pilha[this.topoPilha] = num;
        System.out.println("Inserindo o elemento..: "+num);
        return(this.topoPilha);
        }
    }
    
    int pop(int topo){
        this.topoPilha = topo;
        this.topoPilha--;
        
        if(this.topoPilha < -1){
            JOptionPane.showMessageDialog(null, "Pilha vazia! Erro -997");
        return(this.topoPilha++);
        }else{
            System.out.println("Retirando o valor..: "+this.pilha[this.topoPilha+1]);
            return(this.pilha[this.topoPilha+1]);
        }
    }
    
    int top(int topo){
        this.topoPilha = topo;
        if(this.topoPilha < 0){
            JOptionPane.showMessageDialog(null, "Fila está vazia. Erro -998");
            return(-999);
        }else{
            return(this.pilha[this.topoPilha]);
        }
    }

}