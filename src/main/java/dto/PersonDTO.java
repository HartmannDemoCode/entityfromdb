/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Person;

/**
 *
 * @author thomas
 */
public class PersonDTO {
    private int id;
    private String name;

    public PersonDTO(Person p) {
        this.id = p.getId();
        this.name = p.getName();
    }

    public PersonDTO() {
    }
    
}
