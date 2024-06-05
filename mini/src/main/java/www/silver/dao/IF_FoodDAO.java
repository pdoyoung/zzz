package www.silver.dao;

import java.util.List;

import www.silver.vo.FoodVO;
import www.silver.vo.commentVO;

public interface IF_FoodDAO {
	public void insert(FoodVO fvo) throws Exception;

	public List<FoodVO> selectAll() throws Exception;

	public void delno(String no) throws Exception;

	public FoodVO modno(String no) throws Exception;

	public void foodupdate(FoodVO fvo)throws Exception;

	public List<FoodVO> searchAll(String search) throws Exception;
	
	public void commentinsert(commentVO cvo)throws Exception;

	public List<commentVO> commentAll() throws Exception;
	
	public void saveAttach(String filename) throws Exception;
	

	public List<String> getFilenames(String no) throws Exception;
	
}
