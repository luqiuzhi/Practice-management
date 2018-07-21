package wzu.edu.practice.entity;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

/**
 * 学生表
 * @author 杨竣翔
 *
 */

@Data
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
	
}
