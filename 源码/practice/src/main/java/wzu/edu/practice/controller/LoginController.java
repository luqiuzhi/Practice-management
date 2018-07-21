package wzu.edu.practice.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.EmbeddedServerPortFileWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleIfStatement.Else;
import com.alibaba.druid.util.StringUtils;

import junit.framework.Test;
import wzu.edu.practice.entity.Student;
import wzu.edu.practice.entity.Teacher;
import wzu.edu.practice.entity.UserLogin;
import wzu.edu.practice.service.StudentService;
import wzu.edu.practice.service.TeacherService;
import wzu.edu.practice.utils.CodeUtil;
import wzu.edu.practice.utils.Utils;
import wzu.edu.practice.vo.ResultVO;
import wzu.edu.practice.vo.TablePage;

@RestController
@RequestMapping("/userlogin")
public class LoginController extends MyController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired 
	private TeacherService teacherService;
	
	
	@PostMapping("/login")
	public ResultVO login(@RequestBody UserLogin sl) {
		
		if (StringUtils.isEmpty(sl.getId()+"")) {
			return new ResultVO(ResultVO.FAILE, "学号不能为空", null);
		}
		if (StringUtils.isEmpty(sl.getPassword())) {
			return new ResultVO(ResultVO.FAILE, "密码不能为空", null);
		}
		if (StringUtils.isEmpty(sl.getCode())) {
			return new ResultVO(ResultVO.FAILE, "验证码不能为空", null);
		}
		
		Teacher teacher = new Teacher();
		
		Student student = new Student();
		
		HttpSession session = request.getSession(true);
				
		String code = (String) session.getAttribute("validate");
		
		if (!sl.getCode().equals(code)) {
			
			if ((teacher=teacherService.findById(sl.getId()))!=null) {
				if (Utils.StringToMd5(sl.getPassword()).equals(teacher.getPassword())) {
					return new ResultVO(ResultVO.SUCCESS, "登陆成功", teacher);
				} else {
					return new ResultVO(ResultVO.FAILE, "密码不正确", null);
				}
			} else if ((student=studentService.findById(sl.getId()))!=null) {
				if (Utils.StringToMd5(sl.getPassword()).equals(student.getPassword())) {
					return new ResultVO(ResultVO.SUCCESS, "登陆成功", student);
				} else {
					return new ResultVO(ResultVO.FAILE, "密码不正确", null); 
				}
			} else {
				return new ResultVO(ResultVO.FAILE, "账号不存在", null); 
			}
		}
		
		return new ResultVO(ResultVO.FAILE, "验证码不正确", null);
		
	}
	
	@GetMapping("/code")
	public void code() {
		try {
			new CodeUtil().service(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
