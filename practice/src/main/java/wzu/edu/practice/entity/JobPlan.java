package wzu.edu.practice.entity;

import java.util.Date;

/**
 * 实习时间表
 * @author 杨竣翔
 *
 */
public class JobPlan {

	private int id;						//实习时间逐渐
	private String className;			//班级名称
	private Date beginTime;				//开始时间
	private Date endTime;				//结束时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}
