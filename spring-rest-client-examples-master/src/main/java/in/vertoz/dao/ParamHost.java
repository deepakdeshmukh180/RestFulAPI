package in.vertoz.dao;

import java.util.ArrayList;

public class ParamHost {

	private ArrayList<String> output;
	private Filter filter;

	public ParamHost() {
		super();

	}

	public ParamHost(ArrayList<String> output, Filter filter) {
		super();
		this.output = output;
		this.filter = filter;
	}

	public ArrayList<String> getOutput() {
		return output;
	}

	public void setOutput(ArrayList<String> output) {
		this.output = output;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String toString() {
		return "ParamHost [output=" + output + ", filter=" + filter + "]";
	}
	
	

}
