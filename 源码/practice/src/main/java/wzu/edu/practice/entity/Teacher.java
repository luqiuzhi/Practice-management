package wzu.edu.practice.entity;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

/**
 * 教师表
 * @author 杨竣翔
 *
 */
@Data
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
	
	
}
