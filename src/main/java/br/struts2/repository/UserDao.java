package br.struts2.repository;

import br.struts2.entity.User;

/**
 * Created by allan on 23/08/16.
 */
public interface UserDao {
    User persist(User user);

    User authenticate(User user);
}
