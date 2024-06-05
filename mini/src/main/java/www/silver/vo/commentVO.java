package www.silver.vo;

public class commentVO {
	private int cno=0;//댓글 번호
	private String cname =null;//댓글 작성자 이름
	private String text=null;//댓글
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "commentVO [cno=" + cno + ", cname=" + cname + ", text=" + text + "]";
	}

}
