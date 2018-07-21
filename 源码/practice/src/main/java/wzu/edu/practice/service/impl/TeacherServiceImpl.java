package wzu.edu.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wzu.edu.practice.entity.Teacher;
import wzu.edu.practice.mapper.TeacherMapper;
import wzu.edu.practice.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public Teacher findById(int id) {
		// TODO Auto-generated method stub
		return teacherMapper.findById(id);
	}

}
