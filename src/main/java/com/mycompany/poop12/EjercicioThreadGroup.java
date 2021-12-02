/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop12;

/**
 *
 * @author Daniel Medrano, Angel Jimenez, Ariana Alvarez, Melisa Matias,Luis Gustavo
 */
public class EjercicioThreadGroup extends Thread{
 /**
  * Constructor with parameter = tg
  * Constructor with parameter = string
  * @param tg
  * @param string 
  */
    public EjercicioThreadGroup(ThreadGroup tg, String string) {
        super(tg, string);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }
   
    }

     }
    
    

