package first.sample.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import first.sample.service.SampleService;
import rabs.com.sys.annotation.IncludeComInfo;


@Controller
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
     
    @Resource(name = "SampleService")
    private SampleService sampleService;
    
    @IncludeComInfo(name="기본화면",order = 302)
    @RequestMapping(value="/sample/openSampleBoardList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("main/home");
         
/*        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
        mv.addObject("list", list);*/
         
        return mv;
    }
    
    @IncludeComInfo(name="부트스트랩",order = 303)
    @RequestMapping(value="/sample/bootstrapsample.do")
    public ModelAndView openbootstrapsample(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("sample/bootstrapsample");
        logger.info("부트스트랩");
        return mv;
    }
}


