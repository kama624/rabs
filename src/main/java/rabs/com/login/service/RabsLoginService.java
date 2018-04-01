package rabs.com.login.service;

import java.util.Map;

public interface RabsLoginService {

	public LoginVo getLoginInfo(Map<String, String> parammap);
	
/* 로그인 부분은 로그인시 처리를 하는 부분인데 사용자 정보 관리 메서드를 넣음 나중에 빼야함 
 * 	public Map<String, Object> updatePassword(Map<String, String> parammap);
	
	public int deleteUser(Map<String, String> parammap);
	
	public int addUser(Map<String, String> parammap);*/
}
