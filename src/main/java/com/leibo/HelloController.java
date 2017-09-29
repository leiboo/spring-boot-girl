package com.leibo;

import com.leibo.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daileibo on 07/09/2017.
 */
@RestController
public class HelloController {

    @Autowired
    Girl girl;

    @Value("${university}")
    private String university;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        System.out.println("University:" + university);
        return girl.getCupSize()+"-"+girl.getAge();
    }
}
