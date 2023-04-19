package Pojoclassforemployee;

public class PojoforEmployee {
	String eName;
	int eId;
	int  phoneNo;
	String email;
	String address;

	public PojoforEmployee()
	{}
	public PojoforEmployee(String eName,int eId,int phoneNo,String email,String address)
	{
		this.eName=eName;
		this.eId=eId;
		this.phoneNo=phoneNo;
		this.email=email;
		this.address=address;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
