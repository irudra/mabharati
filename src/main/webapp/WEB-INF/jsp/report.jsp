<%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div id="report" class="container">
  <h2>Table</h2>
  <p>The .table-striped class adds zebra-striping to any table row within body (not available in IE8):</p>
 	<h2>Total balance Available: ${report.balance}</h2>
  <h2>Deposit Report</h2>
  <table class="table table-striped">
      <thead>
      <tr>
        <th>Total Investment Collected</th>
        <th>Deposit Amount</th>
        <th>Interest on Deposit</th>
        <th>Gross Deposit Amount</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${report.depositReport.totalInvestmentCollected}</td>
        <td>${report.depositReport.depositAmount}</td>
        <td>${report.depositReport.intrestOnDeposit}</td>
        <td>${report.depositReport.grossDepostiAmount}</td>
      </tr>
    </tbody>
  </table>
    <h2>Loan Report</h2>
    <table class="table table-striped">
      <thead>
      <tr>
        <th>Eligible Loan Amount</th>
        <th>Loan Disbursed</th>
        <th>Interest for next Month</th>
        <th>Interest till date</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${report.loanReport.elgibleLoanAmount}</td>
        <td>${report.loanReport.loandisbursed}</td>
        <td>${report.loanReport.intrestForNextMonth}</td>
        <td>${report.loanReport.intrestTillDate}</td>
      </tr>
    </tbody>
  </table>
  <a id="dlink"  style="display:none;"></a>

<input type="button" onclick="tableToExcel('monthlyReport', 'name', 'Report.xls')" value="Export to Excel">
  <h2>Deposit Report</h2>
  <table id="monthlyReport" class="table table-striped header-fixed">
      <thead>
      <tr>
        <th>Reporting Month</th>
        <th>This month Deposit</th>
        <th>Interest on Deposit</th>
        <th>Eligible for month</th>
        <th>Current Month interest</th>
        <th>Total interest</th>
        <th>Current Month loan re-payment</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${report.monthlyReports}" var="monthly">
					<tr>
        <td>${monthly.month}</td>
         <td>${monthly.deposite}</td>
        <td><fmt:formatNumber type="number" maxFractionDigits="2" value="${monthly.interestOnDeposite}"/></td>
        <td><fmt:formatNumber type="number" maxFractionDigits="2" value="${monthly.eligibleForLoan}"/></td>
        <td><fmt:formatNumber type="number" maxFractionDigits="2" value="${monthly.currentMonthInterest}"/></td>
        <td><fmt:formatNumber type="number" maxFractionDigits="2" value="${monthly.totalInterest}"/></td>
        <td><fmt:formatNumber type="number" maxFractionDigits="2" value="${monthly.loanRepayment}"/></td>
      </tr>
		</c:forEach>
    </tbody>
  </table>
  
</div>