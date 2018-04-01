package rabs.com.code.service;


import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import common.dao.AbstractDAO;

@Service("commonCodeService")
public class CommonCodeServiceImpl implements CommonCodeService {

    @Resource(name = "abstractDAO")
    private AbstractDAO dao;

	@Override
	public int insertCodeMaster(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int updateCodeMaster(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCodeMaster(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List selectCodeDetailList(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCodeDetail(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCodeDetail(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCodeDetail(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> selectCodeMasterList(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = dao.selectList("common.selectCodeMasterList", paramMap);
		return list;
	}
}
