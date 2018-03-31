package rabs.com.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import rabs.com.app.service.HomeService;
import rabs.com.sys.annotation.IncludeComInfo;

/**
 * Handles requests for the application home page.
 */
@EnableWebMvc
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
    @Resource(name="HomeService")
    private HomeService homeService;
    
	/**
	 * Simply selects the home view to render by returning its name.
	 */
    @IncludeComInfo(name="홈화면이동",order = 301 )
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		/*
		 * 최초 로그인시 권한 체크와 기타 부분에서 확인후 
		 * 권한 없는 경우 로그인 페이지로 
		 * 있는 경우 메인 뷰로 이동
		 */
		// 1. 메인 페이지 이동
		return "forward:/main/mainView.do";
	
	//	return "home";
	}
	
	
	@RequestMapping(value = "/main/mainView.do", method = RequestMethod.GET)
	public String getMainView() {
		logger.info(" The client locale is mainview.");
		
		return "main/MainView";
	}
	

}
