package edu.mum.controller;

import edu.mum.repository.DataFacade;
import edu.mum.repositoryimpl.TestDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Avenash_2 on 6/28/2018.
 */

@Controller
@RequestMapping("/authenticationController")
public class AuthenticationController
{
    @Autowired
    DataFacade dataFacade;

    @RequestMapping(method = RequestMethod.POST)
    public String authenticateUser(@RequestParam("name") String name, @RequestParam("password") String password, Model model){

        //DataFacade data = TestDataImpl.INSTANCE;
        String expectedPassword = dataFacade.findPassword(name );

        if(expectedPassword == null || !expectedPassword.equals(password)) {
            return "index";
        }
        else
        {
            return "advice";
        }
    }
}
