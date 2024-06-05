package www.silver.service;

import java.util.List;

import www.silver.vo.*;

public interface IF_GoodsService {

	//클라이언트가 제품저장이라는 요청을 처리하는 메서드를 정의
	public void insert(GoodsVO gvo) throws Exception;
	public List<GoodsVO> allList(PageVO pagevo) throws Exception;
	public int getTotalCount()throws Exception;
}
