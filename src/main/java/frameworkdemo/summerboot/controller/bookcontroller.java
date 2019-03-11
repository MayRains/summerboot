package frameworkdemo.summerboot.controller;

import frameworkdemo.summerboot.configTest.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@RestController
public class bookcontroller {
    @Autowired
    BookProperties bookProperties;
    @GetMapping("hello")
    public String sayHello(){
        return "hello," +bookProperties.getAuthor() +" writes "+bookProperties.getName();
    }
}
