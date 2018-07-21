package wzu.edu.practice.vo;

import lombok.Data;

@Data
public class TablePage<T>{

	private int code;
	private String msg;
	int count;
	private T data;
	
	public final static int SUCCESS = 200;
	public final static int FAILE = 505 ;
	
	public TablePage(int code,String msg,int count,T data){
		this.code=code;
		this.msg=msg;
		this.count=count;
		this.data=data;
	}

}
