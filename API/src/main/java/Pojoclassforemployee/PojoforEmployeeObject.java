package Pojoclassforemployee;

public class PojoforEmployeeObject {
	String eName;
	int eId;
	int[]  phoneNo;
	Object spouse;

	public PojoforEmployeeObject()
	{

	}

	public PojoforEmployeeObject(String eName,int eId,int[]  phoneNo,Object spouse)
	{

		this.eName=eName;
		this.eId= eId;
		this.phoneNo=phoneNo;
		this. spouse=spouse;
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
	public int[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Object getSpouse() {
		return spouse;
	}
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}


}
