/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesign;

import java.util.Scanner;

/**
 *
 * @author anmol
 */
public class SoftwareDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //CHANGE THE ARRAY 5
        Student[] students = new Student[5];
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name for student " + (i + 1));
            String name = input.nextLine();
            Student student = new Student(name);
            students[i] = student;
        }

        String format = "Student's name is %s\n";
        
        for (Student student: students) {
            System.out.printf(format, student.getName());            
        }        
    }
    
}
