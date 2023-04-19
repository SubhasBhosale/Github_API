package Pojoclass;

public class pojoforcreatingemployee 
{
String ename;
String[] emailId;
int[] phoneno1;
int emplId1;
	public pojoforcreatingemployee(String ename, String[] emailId, int[] phoneno1,int emplId1) 
	{
		this.ename=ename;
		this.emailId=emailId;
		this.phoneno1=phoneno1;
		this.emplId1=emplId1;
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String[] getEmailId() {
		return emailId;
	}
	public void setEmailId(String[] emailId) {
		this.emailId = emailId;
	}
	public int[] getPhoneno1() {
		return phoneno1;
	}
	public void setPhoneno1(int[] phoneno1) {
		this.phoneno1 = phoneno1;
	}
	public int getEmplId1() {
		return emplId1;
	}
	public void setEmplId1(int emplId1) {
		this.emplId1 = emplId1;
	}
	

}
