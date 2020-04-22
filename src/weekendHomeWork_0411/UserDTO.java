package weekendHomeWork_0411;

import java.util.Date;

public class UserDTO {

	private String id;
	private Date date;
	
	public UserDTO() {}
	
	public UserDTO(String id, Date date) {		
		this.id = id;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
