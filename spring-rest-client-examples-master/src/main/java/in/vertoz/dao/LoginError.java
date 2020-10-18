package in.vertoz.dao;

public class LoginError {
	private String jsonrpc;
	Error ErrorObject;
	private float id;


	public String getJsonrpc() {
		return jsonrpc;
	}

	public Error getError() {
		return ErrorObject;
	}

	public float getId() {
		return id;
	}

	// Setter Methods

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public void setError(Error errorObject) {
		this.ErrorObject = errorObject;
	}

	public void setId(float id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "LoginError [jsonrpc=" + jsonrpc + ", ErrorObject=" + ErrorObject + ", id=" + id + "]";
	}
	
	
}
