package wzu.edu.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wzu.edu.practice.entity.Student;
import wzu.edu.practice.mapper.StudentMapper;
import wzu.edu.practice.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.findById(id);
	}
	
	
	
}
