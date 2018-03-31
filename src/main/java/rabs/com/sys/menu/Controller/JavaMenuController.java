package rabs.com.sys.menu.Controller;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.jdbc.log.Log;

import rabs.com.sys.annotation.IncludeComInfo;


@Controller
public class JavaMenuController implements ApplicationContextAware ,InitializingBean {

	private ApplicationContext applicationContext;

	private static final Logger LOGGER = LoggerFactory.getLogger(JavaMenuController.class);

	private Map<Integer, IncludedCompInfoVO> map;

	@Override
	public void afterPropertiesSet() throws Exception {
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		LOGGER.info("JavaMenuController setApplicationContext method has called!");
	}
	
	@RequestMapping("/Content.do")
	public String setContent(ModelMap model){

		return "common/Content";
	}

	/**
	 * header
	 * @param request
	 * @param commandMap
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/main/inc/Header.do")
	public String getHeaderView(HttpServletRequest request, @RequestParam Map<String, Object> commandMap)	  throws Exception{
		return "main/inc/RabsIncHeader";
	}
	
	/**
	 * header
	 * @param request
	 * @param commandMap
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/main/inc/TopNav.do")
	public String getTopNavView(HttpServletRequest request, @RequestParam Map<String, Object> commandMap)	  throws Exception{
		return "main/inc/RabsIncTopnav";
	}
	
	
    /**
	 * JSP 호출작업만 처리하는 공통 함수
	 */
	@RequestMapping(value="/PageLink.do")
	public String moveToPage(@RequestParam("link") String linkPage){
		String link = linkPage;
		// service 사용하여 리턴할 결과값 처리하는 부분은 생략하고 단순 페이지 링크만 처리함
		if (linkPage==null || linkPage.equals("")){
			link="common/Error";
		}
		return link;
	}
	
	/**
	 *
	 * @param request
	 * @param commandMap
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/cmm/forwardPage.do")
	public String forwardPageWithMenuNo(HttpServletRequest request, @RequestParam Map<String, Object> commandMap)
	  throws Exception{
		return "";
	}
	
	
	
	@RequestMapping(value = "/main/inc/Leftmenu.do")
	public String getLeftView(ModelMap model){

		/*최초 한 번만 실행하여 map에 저장해 놓는다.*/
		if(map == null){
			map = new TreeMap<Integer, IncludedCompInfoVO>();
			RequestMapping rmAnnotation;
			IncludeComInfo annotation;
			IncludedCompInfoVO zooVO;

			try{

			/*@Controller Annotation 처리된 클래스를 모두 찾는다.*/
			Map<String, Object> myZoos = applicationContext.getBeansWithAnnotation(Controller.class);
			LOGGER.debug("How many Controllers : {}", myZoos.size());
			for (final Object myZoo : myZoos.values()) {
				Class<? extends Object> zooClass = myZoo.getClass();

				Method[] methods = zooClass.getMethods();
				LOGGER.debug("Controller Detected {}", zooClass);
				for(int i = 0; i< methods.length ;i++){
					annotation = methods[i].getAnnotation(IncludeComInfo.class);

					if(annotation != null){
						//log.debug("Found @IncludeComInfo Method : " + methods[i] );
						zooVO = new IncludedCompInfoVO();
						zooVO.setName(annotation.name());
						zooVO.setOrder(annotation.order());
						zooVO.setLevel(annotation.level());
						
						System.out.println(" zooVo.getName" + zooVO.getName() );
						/*
						 * 목록형 조회를 위한 url 매핑은 @IncludedInfo나 @RequestMapping에서 가져온다
						 */
						rmAnnotation = methods[i].getAnnotation(RequestMapping.class);
						if("".equals(annotation.listUrl())){
							zooVO.setListUrl(rmAnnotation.value()[0]);
						}
						else{
							zooVO.setListUrl(annotation.listUrl());
						}
						map.put(zooVO.getOrder(),zooVO);
					}
				}
				
			}
			
			}catch (Exception e) {
				// TODO: handle exception
			LOGGER.info(e.getMessage());
			}
			
		}
	    LOGGER.info(" 메뉴 패스 정보 "  + map.toString());
		model.addAttribute("resultList", map.values());
		return "main/inc/RabsIncLeftmenu";
	}
}
