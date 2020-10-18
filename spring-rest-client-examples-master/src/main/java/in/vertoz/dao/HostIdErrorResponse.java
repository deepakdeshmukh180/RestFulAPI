package in.vertoz.dao;

public class HostIdErrorResponse {

	private String jsonrpc;
	private Error error;
	private int id;

	public HostIdErrorResponse() {
		super();
	}

	public HostIdErrorResponse(String jsonrpc, Error error, int id) {
		super();
		this.jsonrpc = jsonrpc;
		this.error = error;
		this.id = id;
	}

	public String getJsonrpc() {
		return jsonrpc;
	}

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "HostIdErrorResponse [jsonrpc=" + jsonrpc + ", error=" + error + ", id=" + id + "]";
	}

}
