package weekendHomeWork_0411;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		Date date = new Date(System.currentTimeMillis());
		String path = request.getContextPath();
		
		HttpSession session = request.getSession();
		
		if("sub".equals(id) && "1234".equals(pwd)) {
			
			session.setAttribute("user", new UserDTO(id, date));
			out.println("<script>");
			out.println("top.location.href='index.jsp'");
			out.println("</script>");
			
			
		} else {
			
			out.println("<script>");
			out.println("alert('정보가 없거나 틀립니다')");
			out.println("history.back();");
			out.println("</script>");
			
		}
		
		
	}

}
