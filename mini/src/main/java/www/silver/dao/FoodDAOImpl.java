package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.FoodVO;
import www.silver.vo.commentVO;

@Repository
public class FoodDAOImpl implements IF_FoodDAO{
	private static String mapperQuery="www.silver.dao.IF_FoodDAO";
	@Inject
	private SqlSession sqlSession;
	@Override
	public void insert(FoodVO fvo) throws Exception {
		System.out.println("DAO layer Insert method");
		System.out.println(fvo.toString());
		sqlSession.insert(mapperQuery+".insert", fvo);
	}
	@Override
	public List<FoodVO> selectAll() throws Exception {
		return sqlSession.selectList(mapperQuery+".selectall");
	}
	@Override
	public List<commentVO> commentAll() throws Exception {
		return sqlSession.selectList(mapperQuery+".commentall");
	}
	@Override
	public void delno(String no) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(mapperQuery+".delno", no);
		
	}
	@Override
	public FoodVO modno(String no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+".selectone", no);
	}
	@Override
	public void foodupdate(FoodVO fvo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(mapperQuery+".update", fvo);
	}
	@Override
	public List<FoodVO> searchAll(String search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".search",search);
	}
	@Override
	public void commentinsert(commentVO cvo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DAO layer Insert method");
		System.out.println(cvo.toString());
		sqlSession.insert(mapperQuery+".comment", cvo);
	}
	@Override
	public void saveAttach(String filename) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperQuery+".saveFile", filename);//메핑정보..
	}
	
	
	@Override
	public List<String> getFilenames(String no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperQuery+".getFiles", no);
	}


}
