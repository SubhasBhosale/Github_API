package Pojoclass;

public class spouse 
{
	String name;
	String mailId;
	int phoneno;
	
	public spouse(String name,String mailId,int phoneno)
	{
		this.name=name;
		this.mailId=mailId;
		this.phoneno=phoneno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
}
