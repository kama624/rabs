package rabs.com.code.service;

import java.util.List;
import java.util.Map;

public interface CommonCodeService {

	public List<Map<String, Object>> selectCodeMasterList(Map<String, Object> paramMap);
	
	public int insertCodeMaster(Map<String, String> paramMap);
	
	public int updateCodeMaster(Map<String, String> paramMap);
	
	public int deleteCodeMaster(Map<String, String> paramMap);

	public List<Map<String, Object>>  selectCodeDetailList(Map<String, String> paramMap);
	
	public int insertCodeDetail(Map<String, String> paramMap);
	
	public int updateCodeDetail(Map<String, String> paramMap);
	
	public int deleteCodeDetail(Map<String, String> paramMap);


}
