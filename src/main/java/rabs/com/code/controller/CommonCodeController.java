package rabs.com.code.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;

import rabs.com.code.service.CommonCodeService;
import rabs.com.sys.annotation.IncludeComInfo;


@Controller
public class CommonCodeController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonCodeController.class);
     
	/* 메세지 프로퍼티 읽어 들이기 */
	@Resource(name = "rabsMessageSource")
	private MessageSourceAccessor rabsMessageSource;
	
    @Resource(name = "commonCodeService")
    private CommonCodeService commonCodeService;
    
    @IncludeComInfo(name="공통코드관리",order = 901, level= 3)
    @RequestMapping(value="/code/CommonCodeList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
   //     ModelAndView mv = new ModelAndView("rabs/common/code/CommonCodeList");
        ModelAndView mv = new ModelAndView("rabs/com/code/CommonCodeList");
        
        logger.info(" this is logg : {} " + this.getClass().getName()  + rabsMessageSource.getMessage("success.common.select"));
        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = commonCodeService.selectCodeMasterList(commandMap);
        mv.addObject("resultList", list);
/*        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = sampleService.selectCodeMasterList(commandMap);
        mv.addObject("list", list);*/

        logger.info(" 프러퍼티 파일의 등등록된 키값 확인  " + rabsMessageSource.getMessage("success.common.select"));
 
        return mv;
    }
    
    @IncludeComInfo(name="json테스트용",order = 1001, level= 3)
    @RequestMapping(value="/json/jsonTest.do")
    public ModelAndView selectJsonStringTest(Map<String,Object> commandMap) throws Exception{
   //     ModelAndView mv = new ModelAndView("rabs/common/code/CommonCodeList");
        ModelAndView mv = new ModelAndView("sample/josnTest");
        
        logger.info(" this is logg : {} " + this.getClass().getName()  + rabsMessageSource.getMessage("success.common.select"));
        List<Map<String,Object>> list = commonCodeService.selectCodeMasterList(commandMap);
        mv.addObject("resultList", list);
       
        logger.info(" 프러퍼티 파일의 등등록된 키값 확인  " + rabsMessageSource.getMessage("success.common.select"));
 
        return mv;
    }
    
    @IncludeComInfo(name="json문자열",order = 1002, level= 3)
    @RequestMapping(value="/json/jsonString.do")
    public @ResponseBody Object getJsonString(Map<String,Object> commandMap) throws Exception{
        List<Map<String,Object>> list = commonCodeService.selectCodeMasterList(commandMap);
        logger.info(" 프러퍼티 파일의 등등록된 키값 확인  " + rabsMessageSource.getMessage("success.common.select"));
		return list;
    }
}



