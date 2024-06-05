package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_PostDAO;
import www.silver.vo.PostVO;

@Service
public class PostServiceImpl implements IF_PostService{

	@Inject
	IF_PostDAO pdao;
	@Override
	public void insert(PostVO pvo) throws Exception{
		pdao.insert(pvo);
	}
	@Override
	public List<PostVO> tList() throws Exception {
		// TODO Auto-generated method stub
		return pdao.selectAll();
	}
	@Override
	public void delete(PostVO pvo) throws Exception {
		// TODO Auto-generated method stub
		pdao.delete(pvo);
		
	}
	@Override
	public void update(PostVO pvo) throws Exception {
		// TODO Auto-generated method stub
		pdao.update(pvo);
		
	}
}
