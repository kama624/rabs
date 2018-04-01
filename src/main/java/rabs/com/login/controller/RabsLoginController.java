package rabs.com.login.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import rabs.com.login.service.LoginVo;
import rabs.com.login.service.RabsLoginService;
import rabs.com.sys.annotation.IncludeComInfo;

@Controller
public class RabsLoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(RabsLoginController.class);
    
	/* 메세지 프로퍼티 읽어 들이기 */
	@Resource(name = "messageSourceAccessor")
	private MessageSourceAccessor messageSourceAccessor;
	
    @Resource(name = "rabsLoginService")
    private RabsLoginService rabsLoginService;
  
    
    /*
     * 로그인 입력화면을 출력한다.
     */
    @IncludeComInfo(name="로그인 화면",order = 1001, level= 5)
    @RequestMapping(value="/login.do")
    public String getLoginView(Map<String,Object> commandMap) throws Exception{

        return  "rabs/com/login/RabsLogin" ;
    }
    
    
    @RequestMapping(value="/login/actionLogin.do")
    public String actionLogin(Map<String,String> commandMap,   HttpServletRequest request, Model model) throws Exception{
        
    	LoginVo loginVo =  rabsLoginService.getLoginInfo(commandMap);
    	
    	if(loginVo == null && loginVo.getUserId() == "")
    	{
    		model.addAttribute("resultMsg", messageSourceAccessor.getMessage("fail.common.login"));
    		return "rabs/login/RabsLogin";
    	}
    	else 
    	{
        	request.getSession().setAttribute("loginVO", loginVo);
    		return "redirect:/main/mainView.do";
    	}
    }

    
    /**
	 * 로그아웃한다.
	 * @return String
	 * @exception Exception
	 */
    @RequestMapping(value="/com/login/actionLogout.do")
	public String actionLogout(HttpServletRequest request, ModelMap model)
			throws Exception {

    	/*String userIp = EgovClntInfo.getClntIP(request);

    	// 1. Security 연동
    	return "redirect:/j_spring_security_logout";*/

    	request.getSession().setAttribute("loginVO", null);


    	return "redirect:/login.do";
    }
    
}
