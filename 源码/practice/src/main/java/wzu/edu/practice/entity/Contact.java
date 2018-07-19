package wzu.edu.practice.entity;

import java.util.Date;

/**
 * 联系表
 * @author 杨竣翔
 *
 */
public class Contact {

	private int id;							//主键
	private Date timeDate;					//联系时间
	private String content;					//记录内容
	private Teacher teacher;				//所属教师
	private Student student;				//所属学生
	
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
	public Date getTimeDate() {
		return timeDate;
	}
	public void setTimeDate(Date timeDate) {
		this.timeDate = timeDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
