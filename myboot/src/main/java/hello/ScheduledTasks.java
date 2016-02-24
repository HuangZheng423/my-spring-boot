package hello;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by huangzheng on 2016/1/15.
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public  void reportCurrentTime(){
        System.out.println("The time now is"+dateFormat.format(new Date()));
    }
}
