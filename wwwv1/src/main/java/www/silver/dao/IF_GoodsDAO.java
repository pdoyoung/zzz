package www.silver.dao;

import java.util.List;

import www.silver.vo.GoodsVO;
import www.silver.vo.PageVO;

//서비스단에 호출을 당할 것이고 sqlSesion 호출한다.
public interface IF_GoodsDAO {
	//서비스단에 제공할 서비스를 정의
	public void insert(GoodsVO gvo) throws Exception;
	public List<GoodsVO> selectAll(PageVO pagevo) throws Exception;
	public int getTotalCount()throws Exception;
}
