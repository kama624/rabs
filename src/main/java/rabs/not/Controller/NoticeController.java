package rabs.not.Controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import rabs.com.sys.annotation.IncludeComInfo;
import rabs.not.service.NoticeService;


@Controller
public class NoticeController {
	
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);
     
    @Resource(name = "noticeService")
    private NoticeService noticeService;
    
    @IncludeComInfo(name="공지사항",order = 201, level= 5)
    @RequestMapping(value="/not/NoticeList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("rabs/not/NoticeList");
        logger.info(" this is logg : {} " + this.getClass().getName() );
/*        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
        mv.addObject("list", list);*/
         
        return mv;
    }
    
}



