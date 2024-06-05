package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.PostVO;

@Repository
public class PostDAOImpl implements IF_PostDAO{
	private static String mapperQuery="www.silver.dao.IF_PostDAO";
	@Inject
	private SqlSession sqlSession;
	@Override
	public void insert(PostVO pvo) throws Exception {
		System.out.println("DAO layer Insert method");
		System.out.println(pvo.toString());
		sqlSession.insert(mapperQuery+".insert",pvo);
		
	}
	@Override
	public List<PostVO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".selectall");
	}
	@Override
	public void delete(PostVO pvo) throws Exception {
		sqlSession.delete(mapperQuery+".delete",pvo);
		
	}
	@Override
	public void update(PostVO pvo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(mapperQuery+".update", pvo);
	}

}
