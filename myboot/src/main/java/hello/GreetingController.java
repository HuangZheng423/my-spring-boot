package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by huangzheng on 2016/1/15.
 */
@RestController
public class GreetingController {
    private static  final String template = "Hello %s";
    private final AtomicLong count = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name){
        return  new Greeting(count.incrementAndGet(),String.format(template,name));
    }
}
