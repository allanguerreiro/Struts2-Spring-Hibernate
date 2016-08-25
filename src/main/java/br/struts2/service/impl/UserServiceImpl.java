package br.struts2.service.impl;

import br.struts2.entity.User;
import br.struts2.repository.UserDao;
import br.struts2.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by allan on 23/08/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Inject
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void save(User user) {
        userDao.persist(user);
    }

    public void authenticate(User user) {
        userDao.authenticate(user);
    }

}
