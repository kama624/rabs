package rabs.com.login.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import common.dao.AbstractDAO;

@Service(value="rabsLoginService")
public class RabsLoginServiceImpl  implements RabsLoginService {


    @Resource(name = "abstractDAO")
    private AbstractDAO dao;

    /*
     * 로그인처리시 사용자 정보를 조회한다.
     * @see rabs.com.login.service.RabsLoginService#getLoginInfo(java.util.Map)
     */
	@Override
	public LoginVo getLoginInfo(Map<String, String> parammap) {
		LoginVo loginVo = new LoginVo();

		return loginVo;
	}

	/*
	 * 사용자 비밀번호를 변경한다.
	 * @see rabs.com.login.service.RabsLoginService#updatePassword(java.util.Map)
	 
	@Override
	public Map<String, Object> updatePassword(Map<String, String> parammap) {
		// TODO Auto-generated method stub
		return null;
	}

	 해당 사용자를 삭제한다.
	 * (non-Javadoc)
	 * @see rabs.com.login.service.RabsLoginService#deleteUser(java.util.Map)
	 
	@Override
	public int deleteUser(Map<String, String> parammap) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	 * 사용자를 등록한다.
	 * @see rabs.com.login.service.RabsLoginService#addUser(java.util.Map)
	 
	@Override
	public int addUser(Map<String, String> parammap) {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
