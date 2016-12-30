package cn.edu.bjtu.weibo.model;

public class Result {
	public static final String SUCCESS = "success";
	public static final String FAILED = "failed";
	
	private String status = SUCCESS;
	private String tipCode = "200";
	private String tipMsg = "ok";
	private Object data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if(status == null || (!status.equals(SUCCESS) && !status.equals(FAILED)))
			throw new IllegalArgumentException("status can only be success or failed");
		
		this.status = status;
	}
	public String getTipCode() {
		return tipCode;
	}
	public void setTipCode(String tipCode) {
		this.tipCode = tipCode;
	}
	public String getTipMsg() {
		return tipMsg;
	}
	public void setTipMsg(String tipMsg) {
		this.tipMsg = tipMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
