package com.rudra.spring3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.rudra.calc.bs.report.generator.ReportGenerator;
import com.rudra.calc.bs.report.input.EstimationInput;
import com.rudra.spring3.persistence.mongo.EventsProvider;

@Controller
@SessionAttributes
public class CalculatorController {
	@Autowired
	ReportGenerator generator;
	Gson gson = new Gson();
	Logger logger = LoggerFactory.getLogger(EventsProvider.class);

	@RequestMapping(value = "/calculator", method = RequestMethod.GET)
	public String calculator() {
		return "calculator";
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView calculate(String json) {

		EstimationInput input = gson.fromJson(json, EstimationInput.class);
		System.out.print(gson.toJson(json));
		return new ModelAndView("calculate", "report", generator.generateReport(input));
	}
}