package www.silver.service;

import java.util.List;

import www.silver.vo.*;

public interface IF_PostService {
	
	public void insert(PostVO pvo) throws Exception;
	public List<PostVO> tList() throws Exception;
	public void delete(PostVO pvo) throws Exception;
	public void update(PostVO pvo) throws Exception;
	
}
