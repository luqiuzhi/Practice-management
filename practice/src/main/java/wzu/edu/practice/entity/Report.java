package wzu.edu.practice.entity;

import java.util.Date;

/**
 * 实习报告表
 * @author 杨竣翔
 *
 */
public class Report {

	private int id;						//主键
	private String title;				//报告标题
	private String content;				//报告内容
	private Date createTime;			//创建时间
	private Student student;			//所属学生
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
