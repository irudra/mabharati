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
</div>