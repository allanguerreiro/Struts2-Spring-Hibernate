package br.struts2.repository.impl;

import br.struts2.entity.User;
import br.struts2.repository.UserDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by allan on 23/08/16.
 */
@Repository
public class UserDaoImpl implements UserDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public User persist(User user) {
        entityManager.persist(user);
        return user;
    }

    public User authenticate(User user) {
        return (User) entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username")
                .setParameter("username", user.getUsername()).getSingleResult();
    }
}