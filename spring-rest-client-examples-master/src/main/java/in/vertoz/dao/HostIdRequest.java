package in.vertoz.dao;

public class HostIdRequest {

	private String jsonrpc;
	private String method;
	private ParamHost params;
	private String auth;
	private int id;

	public HostIdRequest() {
		super();
	}

	public HostIdRequest(String jsonrpc, String method, ParamHost params, String auth, int id) {
		super();
		this.jsonrpc = jsonrpc;
		this.method = method;
		this.params = params;
		this.auth = auth;
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

	public ParamHost getParams() {
		return params;
	}

	public void setParams(ParamHost params) {
		this.params = params;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
