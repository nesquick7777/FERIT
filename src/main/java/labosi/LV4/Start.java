/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.github.javafaker.Faker;
/**
 *
 * @author Bole
 */
public class Start {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Student student;
        List<Student> studenti = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            student = new Student();
            student.setIme(faker.name().firstName());
            student.setPrezime(faker.name().lastName());
            student.setFakultet(faker.university().name());
            student.setGodina((int) (Math.random()* (4 - 1 + 1)) + 1);
            student.setMaticniBroj(1234567890+i);
            student.setSmjer(faker.job().field());
            int rand1 = (int) (Math.random()* (5 - 1 + 1) + 1);
            int rand2 = (int) (Math.random()* (5 - 1 + 1) + 1);
            int rand3 = (int) (Math.random()* (5 - 1 + 1) + 1);
            student.setProsjecna_ocjena((double)(rand1+rand2+rand3)/3);
            studenti.add(student);
        }
         for(Student test:studenti){
             System.out.println(test.getMaticniBroj());
             System.out.println(test.getFakultet());
         }
    }
}
