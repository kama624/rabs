package rabs.mng.Controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rabs.com.sys.annotation.IncludeComInfo;
import rabs.mng.service.ManageService;


@Controller
public class ManageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);
     
    @Resource(name = "manageService")
    private ManageService manageService;
    
    @IncludeComInfo(name="관리자",order = 601, level= 3)
    @RequestMapping(value="/mng/ManageList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("rabs/mng/ManageList");
        logger.info(" this is logg : {} " + this.getClass().getName() );
/*        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
        mv.addObject("list", list);*/
         
        return mv;
    }
    
}



