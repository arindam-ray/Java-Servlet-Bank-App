
// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

// Extend HttpServlet class
public class InputData extends HttpServlet {

   private String docType;
   private String title;

   // --------------------------------------- initialization ------------------
   public void init() throws ServletException {

      docType = "<!DOCTYPE html>";
      title = "Bank Application Data ";
   }

   // Method to handle POST method request.
   public void doPost(final HttpServletRequest request, final HttpServletResponse response)
         throws ServletException, IOException {

      // Set response content type
      response.setContentType("text/html");
      final PrintWriter out = response.getWriter();

      final String AccountNo = request.getParameter("AccountNo");
      final String HolderName = request.getParameter("HolderName");
      final String email = request.getParameter("email");
      final String city = request.getParameter("city");
      final String state = request.getParameter("state");
      String PassBookViewing = request.getParameter("PassBookViewing");
      if (PassBookViewing == null)
         PassBookViewing = "No";

      String MoneyTransfer = request.getParameter("MoneyTransfer");

      if (MoneyTransfer == null)
         MoneyTransfer = "No";

      String CheckBookIssue = request.getParameter("CheckBookIssue");
      if (CheckBookIssue == null)
         CheckBookIssue = "No";

      String BankDraftIssue = request.getParameter("BankDraftIssue");
      if (BankDraftIssue == null)
         BankDraftIssue = "No";

      out.println(docType + "<html> " + "<head><title>" + title + "</title></head> " + "<body bgcolor = '#FEF593'>"
            + "<h1 align =  center>" + title + "</h1>" + "<table width = '50%' border = '1' align = 'center'>"
            + "<tr bgcolor = '#949494'>" + "<th>Field Name</th>" + "<th>Field Value</th>" + "</tr>");

      out.print("<tr><td>" + "Account No" + "</td> <td>" + AccountNo + "</td></tr>");
      out.print("<tr><td>" + "Name      " + "</td> <td>" + HolderName + "</td></tr>");
      out.print("<tr><td>" + "Email     " + "</td> <td>" + email + "</td></tr>");
      out.print("<tr><td>" + "City" + "</td> <td>" + city + "</td></tr>");
      out.print("<tr><td>" + "State" + "</td> <td>" + state + "</td></tr>");
      out.print("<tr><td>" + "Passbook View" + "</td> <td>" + PassBookViewing + "</td></tr>");
      out.print("<tr><td>" + "Money Transfer" + "</td> <td>" + MoneyTransfer + "</td></tr>");
      out.print("<tr><td>" + "Checkbook Issue" + "</td> <td>" + CheckBookIssue + "</td></tr>");
      out.print("<tr><td>" + "Bank Draft Issue" + "</td> <td>" + BankDraftIssue + "</td></tr>");

      out.println("</table> </body></html>");
   }

}
