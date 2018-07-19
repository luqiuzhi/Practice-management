package wzu.edu.practice.entity;

import java.util.Date;

/**
 * 岗位表
 * @author 杨竣翔
 *
 */
public class Job {

	private int id;								//岗位主键
	private String jobName;						//岗位名
	private int employeeSize;					//招聘人数
	private String jobRequirements;				//任职要求
	private String salary;						//薪资待遇
	private String majorRequirements;			//专业要求
	private Date createTime;					//发布时间
	private String jobDescribe;					//职位描述
	private Integer status;						//职位状态:0未在招聘,1招聘中
	private Company company;					//所属公司
	
	public Job(){
		this.createTime=new Date();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getEmployeeSize() {
		return employeeSize;
	}
	public void setEmployeeSize(int employeeSize) {
		this.employeeSize = employeeSize;
	}
	public String getJobRequirements() {
		return jobRequirements;
	}
	public void setJobRequirements(String jobRequirements) {
		this.jobRequirements = jobRequirements;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getMajorRequirements() {
		return majorRequirements;
	}
	public void setMajorRequirements(String majorRequirements) {
		this.majorRequirements = majorRequirements;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getJobDescribe() {
		return jobDescribe;
	}
	public void setJobDescribe(String jobDescribe) {
		this.jobDescribe = jobDescribe;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
