package weekendHomeWork_0411;

import java.util.Date;

public class BoardDTO {
	private String subject;
	private String name;
	private String date;
	
	public BoardDTO() {}
	public BoardDTO(String subject, String name, String date) {
		super();
		this.subject = subject;
		this.name = name;
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
}
