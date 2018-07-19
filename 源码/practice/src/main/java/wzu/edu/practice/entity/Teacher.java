package wzu.edu.practice.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 教师表
 * @author 杨竣翔
 *
 */
public class Teacher {
	
	private int id;									//教师工号
	private String password;						//密码
	private String name;							//姓名
	private String department;						//学院
	private String mobilephone;						//教师手机号
	private Integer sex;							//性别:1男,2女
	private String image;							//密码
	private Summary summary;						//实习情况总结
	private Set<Student> studentSet=new HashSet<Student>();				//指导学生
	private Set<Contact> contactSet=new HashSet<Contact>();				//联系记录
	
	public Set<Contact> getContactSet() {
		return contactSet;
	}
	public void setContactSet(Set<Contact> contactSet) {
		this.contactSet = contactSet;
	}
	public Summary getSummary() {
		return summary;
	}
	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	public Set<Student> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
