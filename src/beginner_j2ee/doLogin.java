package beginner_j2ee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/doLogin")
public class doLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		
		if(uname.equals("") && pass.equals("")) {
			req.setAttribute("message", "Username atau password tidak boleh kosong!");
			req.getRequestDispatcher("Login.jsp").forward(req, res);
			return;
		} else if(uname.equals("") || uname == null) {
			req.setAttribute("message", "Username tidak boleh kosong!");
			req.getRequestDispatcher("Login.jsp").forward(req, res);
			return;
		} else if (pass.equals("") || pass == null) {
			req.setAttribute("message", "Password tidak boleh kosong!");
			req.getRequestDispatcher("Login.jsp").forward(req, res);
			return;
		} else {			
			if(uname.equals("abnormal") &&  pass.equals("coffeenyaenakbanget")) {
				req.setAttribute("name", uname);
				req.getRequestDispatcher("success.jsp").forward(req, res);
				return;
			} else {
				req.setAttribute("message", "Username atau password salah dong");
				req.getRequestDispatcher("Login.jsp").forward(req, res);
				return;
			}
		}
		
	}
}
