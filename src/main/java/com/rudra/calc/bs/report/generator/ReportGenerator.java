package com.rudra.calc.bs.report.generator;

import com.rudra.calc.bs.report.input.EstimationInput;
import com.rudra.calc.bs.report.output.EstimationReport;

public interface ReportGenerator {

	EstimationReport generateReport(EstimationInput input);
}
