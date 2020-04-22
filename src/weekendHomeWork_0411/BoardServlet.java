package weekendHomeWork_0411;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BoardServlet extends HttpServlet {
	ServletContext application;
	List<BoardDTO> list;
	
	@Override
	public void init() throws ServletException {
	  application = super.getServletContext();
	  list=(List<BoardDTO>)application.getAttribute("Board");
	}
	
  /**
   * 글 등록했을대..
   * */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Boardservice호출됨...");
		
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session = req.getSession();
		String id = ((UserDTO)session.getAttribute("user")).getId();
		
		String subject = req.getParameter("subject");
		
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String datestr = format.format(Calendar.getInstance().getTime());
		
		BoardDTO bdto = new BoardDTO(subject, id, datestr);
		list.add(bdto);
		
		resp.sendRedirect("center.jsp");
		
	}











}
