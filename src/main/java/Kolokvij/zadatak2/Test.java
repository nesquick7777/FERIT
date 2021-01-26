/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolokvij.zadatak2;

/**
 *
 * @author Bole
 */
import java.io.*;  
public class Test{  
 public static void main(String args[]){  
  try{  
  //Creating the object  
  Student s1 =new Student(211,"Bole");  
  //Creating stream and writing the object  
  FileOutputStream fout=new FileOutputStream("f.txt");  
      try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
          out.writeObject(s1);
          out.flush();
          //closing the stream
      }  
  System.out.println("success");  
  }catch(IOException e){System.out.println(e);}  
  
  
  try{  
      try ( //Creating stream to read the object
              ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"))) {
          Student s=(Student)in.readObject();
          //printing the data of the serialized object
          System.out.println(s.id+" "+s.name);
          //closing the stream
      }  
  }catch(IOException | ClassNotFoundException e){System.out.println(e);} 
 }  
}  
