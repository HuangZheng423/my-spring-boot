package hello;

/**
 * Created by huangzheng on 2016/1/15.
 */
public class Greeting {
    private final long id;
    private final String content;
     public  Greeting(long id,String content){
         this.id = id;
         this.content = content;
     }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
