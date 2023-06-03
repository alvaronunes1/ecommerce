package br.newtonpaiva.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EC-PU");

        EntityManager em = factory.createEntityManager();


        em.remove(1);


        em.close();
        factory.close();
    }
}
