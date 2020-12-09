/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author M2004833
 */
public class Person {
    private int age; 
    private String firstname;
    private String surname;
    private String haircolour;
    private double height;
    private String gender;

    public Person(int age, String firstname, String surname, String haircolour, double height, String gender) {
        this.age = age;
        this.firstname = firstname;
        this.surname = surname;
        this.haircolour = haircolour;
        this.height = height;
        this.gender = gender;
   
    
    
    
    
    }

    @Override
    public String toString() {
        return "Person{" + "\nage=" + age + ", \nfirstname=" + firstname + ", \nsurname=" + surname + ", \nhaircolour=" + haircolour + ", \nheight=" + height + ", \ngender=" + gender + '}';
    }
   
  

    
    
    }

