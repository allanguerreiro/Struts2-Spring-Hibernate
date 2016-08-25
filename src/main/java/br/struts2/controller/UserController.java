package br.struts2.controller;

import br.struts2.entity.User;
import br.struts2.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

/**
 * Created by allan on 23/08/16.
 */
@Controller
@Scope("prototype")
public class UserController extends ActionSupport {

    @Getter @Setter
    private User user;
    @Inject
    @Getter @Setter
    private UserService userService;

    public String add() {
        userService.save(user);
        return SUCCESS;
    }

    public String authenticate() {
        if (user != null) {
            userService.authenticate(user);
            return SUCCESS;
        }

        return ERROR;
    }
}
