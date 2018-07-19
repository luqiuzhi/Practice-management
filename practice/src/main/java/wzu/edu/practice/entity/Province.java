package wzu.edu.practice.entity;

/**
 * 省表
 * @author 杨竣翔
 *
 */
public class Province {

	private int id;							//主键
	private String name;					//省全称
	private String shortName;				//省简称
	
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
}
