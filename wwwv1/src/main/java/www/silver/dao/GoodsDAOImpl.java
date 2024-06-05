package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.GoodsVO;
import www.silver.vo.PageVO;

@Repository
public class GoodsDAOImpl implements IF_GoodsDAO{
	private static String mapperQuery="www.silver.dao.IF_GoodsDAO";
	@Inject
	private SqlSession sqlSession;
	@Override
	public void insert(GoodsVO gvo) throws Exception{
		System.out.println("DAO layer Insert method");
		System.out.println(gvo.toString());
		sqlSession.insert(mapperQuery+".insert",gvo);
		//mybatis sqlsession mapping 기능 구현
		//매핑은 dao interface와mapper파일을 매핑합니다.
	}
	@Override
	public List<GoodsVO> selectAll(PageVO pagevo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".selectall",pagevo);
		//www.silver.dao.IF_Goods
	}
	@Override
	public int getTotalCount() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+".getTotalCount");
	}
}
