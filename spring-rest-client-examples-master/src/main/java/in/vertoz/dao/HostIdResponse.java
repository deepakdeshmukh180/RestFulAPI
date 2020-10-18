package in.vertoz.dao;

import java.util.ArrayList;

public class HostIdResponse {

	private String jsonrpc;
	private ArrayList<HostID> result;
	private int id;

	public HostIdResponse(String jsonrpc, ArrayList<HostID> result, int id) {
		super();
		this.jsonrpc = jsonrpc;
		this.result = result;
		this.id = id;
	}

	public HostIdResponse() {
		super();
	}

	public String getJsonrpc() {
		return jsonrpc;
	}

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public ArrayList<HostID> getResult() {
		return result;
	}

	public void setResult(ArrayList<HostID> result) {
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "HostIdResponse [jsonrpc=" + jsonrpc + ", result=" + result + ", id=" + id + "]";
	}

}
