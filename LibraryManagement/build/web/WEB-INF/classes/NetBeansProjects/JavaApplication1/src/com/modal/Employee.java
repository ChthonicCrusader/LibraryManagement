/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modal;

import java.io.Serializable;

public class Employee implements Serializable
{
    private String name;
    private int empId;
    private transient int salaray;

    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the empId
     */
    public int getEmpId() {
       return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * @return the salaray
     */
    public int getSalaray() {
        return salaray;
    }

    /**
     * @param salaray the salaray to set
     */
    public void setSalaray(int salaray) {
        this.salaray = salaray;
    }
    
}
