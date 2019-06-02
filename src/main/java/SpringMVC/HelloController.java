package SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    /*
     * @作者： LightOfSky
     * @笔记内容： 配置/index映射的页面为index.jsp
     * @日期： 2019/6/2 9:27
     **/
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
