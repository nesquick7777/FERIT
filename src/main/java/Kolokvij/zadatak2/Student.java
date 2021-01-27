/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolokvij.zadatak2;

//   Serijalizacija u Javi je mehanizam zapisivanja stanja objekta u byte-stream tj u trajnu pohranu poput diskovnih datoteka, 
//   baza podataka ili slanje stanja objekta putem mreže. 

import java.io.Serializable;  
public class Student implements Serializable{  
 int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}  
