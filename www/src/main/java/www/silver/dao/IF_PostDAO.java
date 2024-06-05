package www.silver.dao;

import java.util.List;

import www.silver.vo.PostVO;

public interface IF_PostDAO {

	public void insert(PostVO pvo) throws Exception;

	public List<PostVO> selectAll() throws Exception;
	
	public void delete(PostVO pvo) throws Exception;
	
	public void update(PostVO pvo) throws Exception;
}
