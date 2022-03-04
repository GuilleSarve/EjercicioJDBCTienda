package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO{
    
    protected EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();

}
