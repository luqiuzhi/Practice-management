package wzu.edu.practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("wzu.edu.practice.mapper")
@SpringBootApplication
public class PracticeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSystemApplication.class, args);
	}
}
