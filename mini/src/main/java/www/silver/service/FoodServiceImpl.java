package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_FoodDAO;
import www.silver.vo.FoodVO;
import www.silver.vo.commentVO;

@Service
public class FoodServiceImpl implements IF_FoodService{
	@Inject
	IF_FoodDAO fdao;

	@Override
	public void insert(FoodVO fvo) throws Exception {
		// TODO Auto-generated method stub
		//table에 저장한다
		fdao.insert(fvo);
		//attach에 저장해야 한다 ... 해야 할 작업.. 테이블 만들고 . dao mapper 작업해야 한다..
		String[] filename = fvo.getFilename();
		for(String fname : filename) {
			fdao.saveAttach(fname);
		}
		
		
	}

	@Override
	public List<FoodVO> tList() throws Exception {
		// TODO Auto-generated method stub
		return fdao.selectAll();
	}


	@Override
	public List<FoodVO> searchList(String search) throws Exception {
		// TODO Auto-generated method stub
		return fdao.searchAll(search);
	}

	@Override
	public void deleno(String no) throws Exception {
		// TODO Auto-generated method stub
		fdao.delno(no);
	}

	@Override
	public FoodVO modno(String no) throws Exception {
		// TODO Auto-generated method stub

		return fdao.modno(no);
	}

	@Override
	public void modnoSaver(FoodVO fvo) throws Exception {
		// TODO Auto-generated method stub
		fdao.foodupdate(fvo);
	}

	@Override
	public void commentinsert(commentVO cvo) throws Exception {
		// TODO Auto-generated method stub
		fdao.commentinsert(cvo);
	}

	@Override
	public List<commentVO> commentList() throws Exception {
		// TODO Auto-generated method stub
		return fdao.commentAll();
	}

	@Override
	public List<String> getFilenames(String no) throws Exception {
		// TODO Auto-generated method stub
		return fdao.getFilenames(no);
	}



}
