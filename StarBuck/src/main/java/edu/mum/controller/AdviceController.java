package edu.mum.controller;

import edu.mum.repository.DataFacade;
import edu.mum.repositoryimpl.TestDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Avenash_2 on 6/28/2018.
 */

@Controller
@RequestMapping("/adviceController")
public class AdviceController
{
    @Autowired
    DataFacade dataFacade;

    @RequestMapping(method = RequestMethod.GET)
    protected String getAdvice(@RequestParam("roast") String roast, Model model)
    {
        //DataFacade data = TestDataImpl.INSTANCE;;
        model.addAttribute("list", dataFacade.getAdvice(roast) );
        return "display";
    }
}
