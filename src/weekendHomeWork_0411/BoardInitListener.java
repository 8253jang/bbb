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

@WebListener //���
public class BoardInitListener implements ServletContextListener{
	List<BoardDTO> list = new ArrayList<BoardDTO>();
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("��������� �ʱ�ȭ�۾������...");	
		
		list.add(new BoardDTO("�ȳ��ϼ���", "jang", "2019/06/29"));
		list.add(new BoardDTO("������", "jang", "2020/03/18"));
		list.add(new BoardDTO("�ָ��ε� ������..", "jang", "2020/04/11"));
		
		ServletContext application = sce.getServletContext();
		application.setAttribute("Board", list);
	}
	
}
