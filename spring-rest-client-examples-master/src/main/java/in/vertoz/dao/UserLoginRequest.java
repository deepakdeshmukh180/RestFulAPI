package in.vertoz.dao;

public class UserLoginRequest {

	private String jsonrpc;
	private String method;
	private Params params;
	private int id;

	public UserLoginRequest() {
		super();
	}

	public UserLoginRequest(String jsonrpc, String method, Params params, int id) {
		super();
		this.jsonrpc = jsonrpc;
		this.method = method;
		this.params = params;
		this.id = id;
	}

	public String getJsonrpc() {
		return jsonrpc;
	}

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Params getParams() {
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserLoginRequest [jsonrpc=" + jsonrpc + ", method=" + method + ", params=" + params + ", id=" + id
				+ "]";
	}

}
