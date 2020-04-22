package weekendHomeWork_0411;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebListener //등록
public class BoardInitListener implements ServletContextListener{
	List<BoardDTO> list = new ArrayList<BoardDTO>();
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("서버실행시 초기화작업진행됨...");	
		
		list.add(new BoardDTO("안녕하세요", "jang", "2019/06/29"));
		list.add(new BoardDTO("오늘은", "jang", "2020/03/18"));
		list.add(new BoardDTO("주말인데 과제를..", "jang", "2020/04/11"));
		
		ServletContext application = sce.getServletContext();
		application.setAttribute("Board", list);
	}
	
}
