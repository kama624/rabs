/**
 * 
 */
package rabs.com.app.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import common.dao.AbstractDAO;

/**
 * @author yong
 *
 */

@Service("HomeService")
public class HomeServiceImpl extends AbstractDAO implements HomeService{
 
    public void commcodeList() throws SQLException {
    	selectOne("sample.commcodeList");
    }

	@Override
	public String testList(List<String> testList) {
		// TODO Auto-generated method stub
		return null;
	}

}
