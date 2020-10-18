package in.vertoz.dao;

public class HostID {

	private String hostid;

	public HostID() {
		super();
	}

	public HostID(String hostid) {
		super();
		this.hostid = hostid;
	}

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	@Override
	public String toString() {
		return "HostID [hostid=" + hostid + "]";
	}

}
