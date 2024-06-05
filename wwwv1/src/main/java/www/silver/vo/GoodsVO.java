package www.silver.vo;

public class GoodsVO {
	
	private String name=null;
	private String gg_num=null;
	private String username=null;
	private String in_date=null;
	private int no=0;
	
	@Override
	public String toString() {
		return "GoodsVO [name=" + name + ", gg_num=" + gg_num + ", username=" + username + ", in_date=" + in_date
				+ ", no=" + no + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGg_num() {
		return gg_num;
	}

	public void setGg_num(String gg_num) {
		this.gg_num = gg_num;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
}
