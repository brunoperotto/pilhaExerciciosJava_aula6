/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplopilhas_bruno;

/**
 *
 * @author Usuario
 */
public class ExemploPilhas_bruno {

    public static void main(String[] args) {
        
        int topo = -1,topo2 = -1, valor, cont = 0;
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        
        for(int i=0;i<10;i++){
            if(cont != 3){
                topo = pilha1.push(topo, i);
                cont++;
            }else{
                topo2 = pilha2.push(topo2, pilha1.pop(topo));
                cont=0;
            }
        }
        
        pilha1.imprimir(topo);
        System.out.println("---------------");
        pilha2.imprimir(topo2);
        
        /*
        int topo = -1, valor;
        Pilha pilha1 = new Pilha();
        
        topo = pilha1.push(topo, 1);
        topo = pilha1.push(topo, 290);
        topo = pilha1.push(topo, 38);
        
        pilha1.imprimir(topo);
        System.out.println("-----------------------");
        System.out.println("O valor no topo da pilha é..: "+pilha1.top(topo));
        
        valor = pilha1.pop(topo);
        topo--;
        
        System.out.println("O valor retirado é..: "+valor);
        System.out.println("O valor no topo da pilha é..: "+pilha1.top(topo));
        
        pilha1.imprimir(topo);
        
        System.out.println("O tamanho da pilha é..: "+pilha1.tamanho());
        
        System.out.println("-----------------------");
        topo = pilha1.esvazie_pilha();
        System.out.println("O tamanho da pilha é..: "+pilha1.tamanho());
        System.out.println("O valor no topo da pilha é..: "+pilha1.top(topo));
        
        valor = pilha1.pop(topo);
        topo--;
        
        System.out.println("-----------------------");
        
        for(int i=0;i<10;i++){
            topo = pilha1.push(topo, i);
        }
        System.out.println("-----------------------");
        pilha1.imprimir(topo);
        
        topo = pilha1.push(topo, 10);
        pilha1.imprimir(topo);
        */
        
        /*
        int topo = -1, valor;
        Pilha pilha1 = new Pilha();
            
            topo = pilha1.push(topo, 1);
            pilha1.imprimir(topo);
            
            topo = pilha1.push(topo, 10);
            topo = pilha1.push(topo, 5);
            topo = pilha1.push(topo, 5);
            
            pilha1.imprimir(topo);
            
            System.out.println("------------------");
            
            topo = pilha1.esvazie_pilha();
            
            topo = pilha1.push(topo, 1);
            topo = pilha1.push(topo, 2);
            topo = pilha1.push(topo, 3);
            topo = pilha1.push(topo, 4);
            topo = pilha1.push(topo, 5);
            
            pilha1.imprimir(topo);
            
            System.out.println("------------------");
            
            valor = pilha1.pop(topo);
            topo--;
            
            System.out.println("Valor retirado é: "+valor);
            
            pilha1.imprimir(topo);
            
            System.out.println("O tamanho da pilha é..: "+pilha1.tamanho());
           */
    }
}
