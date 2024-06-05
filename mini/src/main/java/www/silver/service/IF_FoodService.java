package www.silver.service;

import java.util.List;

import www.silver.vo.*;

public interface IF_FoodService {
	public void insert (FoodVO fvo) throws Exception;

	public List<FoodVO> tList() throws Exception ;
	public void deleno(String no) throws Exception;
	public FoodVO modno(String no) throws Exception;
	public void modnoSaver(FoodVO fvo) throws Exception;
	public List<FoodVO> searchList(String search) throws Exception;
	public void commentinsert (commentVO cvo)throws Exception;
	public List<commentVO> commentList() throws Exception ;
	public List<String> getFilenames (String no) throws Exception;
	
}
