package wzu.edu.practice.enums;


public enum JobEnum {
	JOB_NO_EMPLOYEE(0,"未招聘"),
	JOB_EMPLOYEE(1,"招聘中");
	
	private int state;
	private String stateInfo;
	
	private JobEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	
	public static JobEnum stateOf(int index) {
		for(JobEnum state:values()) {
			if(state.getState()==index) {
				return state;
			}
		}
		return null;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	
	
}
