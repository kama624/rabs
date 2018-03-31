package rabs.pop.Controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import rabs.com.sys.annotation.IncludeComInfo;
import rabs.not.service.NoticeService;
import rabs.pop.service.PopupService;


@Controller
public class PopupController {
	
	private static final Logger logger = LoggerFactory.getLogger(PopupController.class);
     
    @Resource(name = "popupService")
    private PopupService popupService;
    
    @IncludeComInfo(name="팝업설정",order = 401, level= 3)
    @RequestMapping(value="/pop/PopupList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("rabs/pop/PopupList");
        logger.info(" this is logg : {} " + this.getClass().getName() );
/*        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
        mv.addObject("list", list);*/
         
        return mv;
    }
    
}



