/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dto.PersonDTO;
import entities.Person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author thomas
 */
public class Facade {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    public List<PersonDTO> getAllPersons(){
        List<PersonDTO> pdtolist = new ArrayList();
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> tq = em.createNamedQuery("Person.findAll", Person.class);
        List<Person> persons = tq.getResultList();
        persons.stream().forEach(p->{pdtolist.add(new PersonDTO(p));});
        return pdtolist;
    }
}
