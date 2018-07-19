package wzu.edu.practice.entity;

import java.util.Date;

/**
 * 实习情况总结表
 * @author 杨竣翔
 *
 */
public class TeacherSummary {

	private int id;							//主键
	private String estimate;				//评价
	private String problem;					//问题
	private String ideaSchool;				//对本次工作意见
	private String gain;					//收获
	private String ideaCompany;				//对实习单位意见
	private Date summaryTime;				//总结时间
	private Teacher teacher;				//所属老师
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstimate() {
		return estimate;
	}
	public void setEstimate(String estimate) {
		this.estimate = estimate;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getIdeaSchool() {
		return ideaSchool;
	}
	public void setIdeaSchool(String ideaSchool) {
		this.ideaSchool = ideaSchool;
	}
	public String getGain() {
		return gain;
	}
	public void setGain(String gain) {
		this.gain = gain;
	}
	public String getIdeaCompany() {
		return ideaCompany;
	}
	public void setIdeaCompany(String ideaCompany) {
		this.ideaCompany = ideaCompany;
	}
	public Date getSummaryTime() {
		return summaryTime;
	}
	public void setSummaryTime(Date summaryTime) {
		this.summaryTime = summaryTime;
	}
	
}
