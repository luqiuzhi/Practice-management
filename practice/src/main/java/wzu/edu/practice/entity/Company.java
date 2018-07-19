package wzu.edu.practice.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 公司表
 * @author 杨竣翔
 *
 */
public class Company {

	private int id;								//公司主键
	private String companyName;					//公司名称
	private String address;						//公司地址
	private int companySize;					//公司人数规模
	private String type;						//公司性质
	private String postcode;					//公司邮编
	private String contactPerson;				//联系人
	private String mobilePhone;					//联系电话
	private String companyDetails;				//公司详情
	private Set<Job> jobSet=new HashSet<Job>();			//岗位表
	
	public Set<Job> getJobSet() {
		return jobSet;
	}
	public void setJobSet(Set<Job> jobSet) {
		this.jobSet = jobSet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCompanySize() {
		return companySize;
	}
	public void setCompanySize(int companySize) {
		this.companySize = companySize;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(String companyDetails) {
		this.companyDetails = companyDetails;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName
				+ ", address=" + address + ", companySize=" + companySize
				+ ", type=" + type + ", postcode=" + postcode
				+ ", contactPerson=" + contactPerson + ", mobilePhone="
				+ mobilePhone + ", companyDetails=" + companyDetails + "]";
	}
	
	
}
