package pojolibrary;
public class PojoWithobjectParameter {
	String createdBy;
	String projectName;
	String[] status;
	int[] teamSize;
	 spouse sp;
	public PojoWithobjectParameter(String createdBy,String projectName,	String[] status,int[] teamSize, spouse sp)
	{
		this. createdBy=createdBy;
		this. projectName=projectName;
		this. status=status;
		this. teamSize=teamSize;
		this. sp=sp;
	}
	public String getCreatedBy() {
		return createdBy;
	}
public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String[] getStatus() {
		return status;
	}
	public void setStatus(String[] status) {
		this.status = status;
	}
	public int[] getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int[] teamSize) {
		this.teamSize = teamSize;
	}
	public spouse getSp() {
		return sp;
	}
public void setSp(spouse sp) {
		this.sp = sp;
	}	
}
//public void setcreatedBy(String createdBy)
//{
//	this.createdBy=createdBy;
//}
//public void setprojectName(String projectName)
//{
//	this.projectName=projectName;
//}
//public void setstatus(String[] status)
//{
//	this.status=status;
//}
//public void setspouse(spouse sps)
//{
//	this.sp=sp;
//}
//public void setteamSize(int[] teamSize)
//{
//	this.teamSize=teamSize;
//}
//public String getcreatedBy()
//{
//	return createdBy;
//}
//public String getprojectName(String projectName)
//{
//	return projectName;
//}
//public String[] getstatus(String[] status)
//{
//	return status;
//}
//public  spouse getspouse( spouse sps)
//{
//	return sps;
//}
//public void getteamSize(int[] teamSize)
//{
//	this.teamSize=teamSize;
//}