package in.vertoz.dao;

import in.vertoz.dao.Error;;

public class FailedObject {

	private String jsonrpc;
	private Error error;
	private int id;

	public FailedObject() {
		super();
	}

	public FailedObject(String jsonrpc, Error error, int id) {
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

}
