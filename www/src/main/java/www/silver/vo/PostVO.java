package www.silver.vo;

public class PostVO {
	private String region_name=null;
	private String region=null;
	private String name = null;
	private int no=0;
	private String in_date=null;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getIn_date() {
		return in_date;
	}
	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}
	@Override
	public String toString() {
		return "PostVO [region_name=" + region_name + ", region=" + region + ", name=" + name + ", no=" + no
				+ ", in_date=" + in_date + "]";
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
