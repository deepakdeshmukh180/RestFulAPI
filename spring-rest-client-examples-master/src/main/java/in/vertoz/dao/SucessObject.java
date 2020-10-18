package in.vertoz.dao;

public class SucessObject {
	private String jsonrpc;
	private String result;
	private float id;

	public SucessObject() {
		super();
	}

	public SucessObject(String jsonrpc, String result, float id) {
		super();
		this.jsonrpc = jsonrpc;
		this.result = result;
		this.id = id;
	}

	// Getter Methods

	public String getJsonrpc() {
		return jsonrpc;
	}

	public String getResult() {
		return result;
	}

	public float getId() {
		return id;
	}

	// Setter Methods

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setId(float id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SucessObject [jsonrpc=" + jsonrpc + ", result=" + result + ", id=" + id + "]";
	}
	
	
}
