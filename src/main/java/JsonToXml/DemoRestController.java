package JsonToXml;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //1
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson",
            produces = {"application/json;charset=UTF-8"}) //2
    public DemoObj getjson(DemoObj obj) {
        return new DemoObj(obj.getID() + 1, obj.getName() + "yy");//3
    }

    @RequestMapping(value = "/getxml",
            produces = {"application/xml;charset=UTF-8"})//4
    public DemoObj getxml(DemoObj obj) {
        return new DemoObj(obj.getID() + 1, obj.getName() + "yy");
    }

}
