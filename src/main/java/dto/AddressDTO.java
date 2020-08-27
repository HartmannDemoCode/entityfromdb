/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Address;
import entities.Person;
import java.util.List;

/**
 *
 * @author thomas
 */
public class AddressDTO {
    private int id;
    private String street;
    private int zip;
    private List<String> persons;

    public AddressDTO(Address adr) {
        this.id = adr.getId();
        this.street = adr.getStreet();
        this.zip = adr.getZip();
        for (Person person : adr.getPersonList()) {
            this.persons.add(person.toString());
        }
    }

    public AddressDTO() {
    }
    
}
