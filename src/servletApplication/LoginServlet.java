package servletApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.regex.*;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//String password = "qwerty";
		PrintWriter out = resp.getWriter();

		//user name validation
		String pattern_name = "^[A-Z]{1}[a-z]{2,}$";
		String userName = req.getParameter("username");
		Pattern p = Pattern.compile(pattern_name);
		Matcher m = p.matcher(userName);
		if (m.matches() == true) {
			String nameresponse = "<html>";
			nameresponse+="<h1>username is valid"+"</h1>";
			nameresponse+="</html>";
			out.println(nameresponse);
		}
		else {
			String errornameresponse = "<html>";
			errornameresponse+="<h1>first character should be in caps"+"</h1>";
			errornameresponse+="</html>";
			out.println(errornameresponse);
		}
/*
		//password validation
		String pswd = req.getParameter("pw");
		String pattern_passWord = "((?=.*[0-9])(?=.*[A-Z]{1})(?=.*[a-z])(?=.*[@#$%]{1})).{8,}";
		Pattern pt = Pattern.compile(pattern_passWord);
		Matcher mt = pt.matcher(pswd);
		if(mt.matches() == true) {
			String pwsdresponse = "<html>";
			pwsdresponse+="<h1> password is valid"+"</h1>";
			pwsdresponse+="</html>";
			out.println(pwsdresponse);
		}
		else {
			String errorpswdresponse = "<html>";
			errorpswdresponse+="<h1> password must contain at least 1 uppercase, 1 numeric, 1 special char and minimum 8 characters"+"</h1>";
			errorpswdresponse+="</html>";
			out.println(errorpswdresponse);
		}

		if (pswd.equals(password)) {
			String htmlresponse = "<html>";
			htmlresponse+="<h1>username is: "+userName+"</h1>";
			htmlresponse+="<h1>login successfull "+"</h1>";
			htmlresponse+="</html>";
			out.println(htmlresponse);
		}
		else {
			String errorresponse = "<html>";
			errorresponse+="<h1>username is: "+userName+"</h1>";
			errorresponse+="<h1>login failed "+"</h1>";
			errorresponse+="</html>";
			out.println(errorresponse);
		}
*/
	}
}
