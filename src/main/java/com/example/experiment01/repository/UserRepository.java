package com.example.experiment01.repository;

import com.example.experiment01.entity.Address;
import com.example.experiment01.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public void addUserAddress() {
        User user = new User("hgl");
        em.persist(user);
        Address address1 = new Address("956");
        address1.setUser(user);
        em.persist(address1);

        Address address2 = new Address("925");
        address2.setUser(user);
        em.persist(address2);
    }
}
