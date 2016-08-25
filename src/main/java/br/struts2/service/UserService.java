package br.struts2.service;

import br.struts2.entity.User;

/**
 * Created by allan on 23/08/16.
 */
public interface UserService {

    void save(User user);
    void authenticate(User user);

}
