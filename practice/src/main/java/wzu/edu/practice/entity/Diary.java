package wzu.edu.practice.entity;

import java.util.Date;

/**
 * 日记表
 * @author 杨竣翔
 *
 */
public class Diary {

	private int id;							//主键
	private String title;					//日记标题
	private String content;					//日记内容
	private Date createTime;				//创建时间
	private Student student;				//所属学生
	
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
