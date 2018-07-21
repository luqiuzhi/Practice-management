package wzu.edu.practice.vo;

import lombok.Data;

@Data
public class ResultVO {
	private int code;
	private String msg;
	private Object data;
	
	public final static int SUCCESS = 200;
	public final static int FAILE = 505 ;
	
	public ResultVO(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	
}
