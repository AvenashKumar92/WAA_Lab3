package edu.mum.controller;

import edu.mum.domain.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/calc2")
public class CalculatorController {

	@RequestMapping(method = RequestMethod.POST)
	public String calculate(Calculator calculator, Model model){
		calculator.setSum(calculator.getAdd1()+calculator.getAdd2());
		calculator.setProduct(calculator.getMult1()*calculator.getMult2());
		model.addAttribute(calculator);
		return "result";
	}
}
