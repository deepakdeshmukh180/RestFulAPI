package in.vertoz.dao;

public class Error {
	
	private float code;
	private String message;
	private String data;

	public Error() {
		super();
	}

	// Getter Methods

	public Error(float code, String message, String data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public float getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getData() {
		return data;
	}

	// Setter Methods

	public void setCode(float code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Error [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
	
}
