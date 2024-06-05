package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_GoodsDAO;
import www.silver.vo.GoodsVO;
import www.silver.vo.PageVO;

@Service
public class GoodsServiceImpl implements IF_GoodsService {
	@Inject
	IF_GoodsDAO gdao;

	@Override // 작업의 절차를 명시한다
	public void insert(GoodsVO gvo) throws Exception {// 서비스를수행한다
		// TODO Auto-generated method stub
		// DAO에게 넘겨준다...
		gdao.insert(gvo);// DAO에게 insert 서비스 호출한다.
	}

	@Override
	public List<GoodsVO> allList(PageVO pagevo) throws Exception {
		// TODO Auto-generated method stub
		return gdao.selectAll(pagevo);// gdao객체
	}

	@Override
	public int getTotalCount() throws Exception {
		// TODO Auto-generated method stub
		return gdao.getTotalCount();
	}

}
