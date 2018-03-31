package rabs.mng.service;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.log.Log;

import common.dao.AbstractDAO;

@Service("manageService")
public class ManageServiceImpl implements ManageService {

    @Resource(name = "abstractDAO")
    private AbstractDAO dao;

	public List selectBoardList(Map paramMap) {
		
		List list = dao.selectList("sample.selectBoardList", paramMap);
		for (int i = 0  ; i< list.size() ; i++){
			System.out.println(" == " + list.get(i));
		}
		
		
		return null;
	}
}
