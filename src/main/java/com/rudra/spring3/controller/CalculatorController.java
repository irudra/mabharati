package com.rudra.spring3.controller;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.rudra.calc.bs.report.generator.EstimationReportGenerator;
import com.rudra.calc.bs.report.generator.ReportGenerator;
import com.rudra.calc.bs.report.input.DepositInput;
import com.rudra.calc.bs.report.input.EstimationInput;
import com.rudra.calc.bs.report.input.LoanInput;
import com.rudra.spring.page.factory.IPageDetailsFactory;
import com.rudra.spring.page.factory.PageDetailsFactory;
import com.rudra.spring.page.value.Message;
import com.rudra.spring3.data.Event;
import com.rudra.spring3.persistence.mongo.EventsProvider;

@Controller
@SessionAttributes
public class CalculatorController {

	Logger logger = LoggerFactory.getLogger(EventsProvider.class);
	IPageDetailsFactory factory = PageDetailsFactory.getFactory();
	Message message = new Message();

	@RequestMapping(value = "/calculator", method = RequestMethod.GET)
	public String calculator() {
		EstimationInput input = new EstimationInput();
		DepositInput dInput = new DepositInput();
		LoanInput iInput = new LoanInput();
		iInput.setAvgPeriod(20);
		iInput.setIntrestRateOnLoan(12);
		dInput.setAnnualRateOfIntrestOnDeposit(10);
		dInput.setSubscriptionAmount(500);
		dInput.setSucscriptionNumber(2000);
		input.setDepositInput(dInput);
		input.setLoanInput(iInput);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 10);
		input.setEstimationDate(c.getTime());
		ReportGenerator generator = new EstimationReportGenerator();
		generator.generateReport(input);
		return "calculator";
	}
	
	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView calculate(String json) {
		Gson gson = new Gson();
		EstimationInput input = gson.fromJson(json, EstimationInput.class);
		ReportGenerator generator = new EstimationReportGenerator();
		System.out.print(gson.toJson(json));
		return new ModelAndView("calculate", "report",
				generator.generateReport(input));
	}
}