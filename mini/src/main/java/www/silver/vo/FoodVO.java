package www.silver.vo;

public class FoodVO {
	private int no=0;//번호
	private String name =null;//가게이름
	private String zone = null;//지역명
	private String introduction = null;//한줄소개
	private int grade = 0;//별점
	private String username = null;//작성자 이름
	private String in_date=null;//등록일
	private String search=null;//검색어 저장
	private int pw = 0;//비밀번호
	private String[] filename=null;
	public int getNo() {
		return no;
	}
	public String[] getFilename() {
		return filename;
	}
	public void setFilename(String[] filename) {
		this.filename = filename;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
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
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "FoodVO [no=" + no + ", name=" + name + ", zone=" + zone + ", introduction=" + introduction + ", grade="
				+ grade + ", username=" + username + ", in_date=" + in_date + ", search=" + search + ", pw=" + pw + "]";
	}
	
	

}
