/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamental;

/**
 *
 * @author mehta
 */
public class Student1 {

    private String name;
    private int studentId;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public int getId(){
        return studentId;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
            this.name = givenName;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
}
