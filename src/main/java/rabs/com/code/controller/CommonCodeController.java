package rabs.com.code.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import rabs.com.code.service.CommonCodeService;
import rabs.com.sys.annotation.IncludeComInfo;


@Controller
public class CommonCodeController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonCodeController.class);
     
    @Resource(name = "commonCodeService")
    private CommonCodeService commonCodeService;
    
    @IncludeComInfo(name="공통코드관리",order = 901, level= 3)
    @RequestMapping(value="/code/CommonCodeList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
   //     ModelAndView mv = new ModelAndView("rabs/common/code/CommonCodeList");
        ModelAndView mv = new ModelAndView("rabs/com/code/CommonCodeList");
        
        logger.info(" this is logg : {} " + this.getClass().getName() );
        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = commonCodeService.selectCodeMasterList(commandMap);
        mv.addObject("resultList", list);
/*        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = sampleService.selectCodeMasterList(commandMap);
        mv.addObject("list", list);*/
         
        return mv;
    }
    
}



