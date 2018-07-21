package wzu.edu.practice.mapper;

import wzu.edu.practice.entity.Student;

public interface StudentMapper {

	/**
	 * 
	 * @param id 学生学号
	 * @return 学生对象
	 */
	public Student findById(int id);
}
