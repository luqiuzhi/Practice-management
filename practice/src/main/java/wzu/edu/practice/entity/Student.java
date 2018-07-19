package wzu.edu.practice.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生表
 * @author 杨竣翔
 *
 */
public class Student {

	private int id;								//学号
	private String name;						//姓名
	private String password;					//密码
	private String college;						//学院
	private String major;						//专业
	private String studentClass;				//班级
	private String mobilephone;					//手机号码
	private int score;							//成绩
	private String image;						//头像
	private String remark;						//评语
	private Teacher teacher;					//所属老师
	private Set<Diary> diarySet=new HashSet<Diary>();			//实习日记表
	
	public Set<Diary> getDiarySet() {
		return diarySet;
	}
	public void setDiarySet(Set<Diary> diarySet) {
		this.diarySet = diarySet;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
