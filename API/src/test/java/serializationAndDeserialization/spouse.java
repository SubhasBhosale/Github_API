package serializationAndDeserialization;

public class spouse {
	String eName;
	int eId;

	public spouse(String eName,int eId)
	{
		this.eName=eName;
		this.eId=eId;
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
}
