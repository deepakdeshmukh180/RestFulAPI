package in.vertoz.dao;

import java.util.ArrayList;

public class Filter {
	private ArrayList<String> host;

	public Filter() {
		super();
	}

	public Filter(ArrayList<String> host) {
		super();
		this.host = host;
	}

	public ArrayList<String> getHost() {
		return host;
	}

	public void setHost(ArrayList<String> host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Filter [host=" + host + "]";
	}

	
}
