package rabs.rest.Controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import rabs.com.sys.annotation.IncludeComInfo;
import rabs.rest.service.RestaurantService;


@Controller
public class RestaurantController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);
     
    @Resource(name = "restaurantService")
    private RestaurantService restaurantService;
    
    @IncludeComInfo(name="식당리스트",order = 101, level= 5)
    @RequestMapping(value="/rest/RestaurantList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("rabs/rest/RestaurantList");
        logger.info(" this is logg : {} " + this.getClass().getName() );
/*        @SuppressWarnings("unchecked")
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
        mv.addObject("list", list);*/
         
        return mv;
    }
    
}



