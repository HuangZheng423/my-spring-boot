package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by huangzheng on 2016/1/18.
 */
@Controller
public class FileUpLoadController {
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public @ResponseBody String privadeUploadInfo(){
        return "You can upload file by posting to this same url.";
    }

    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam("name") String name,
                                                 @RequestParam("file")MultipartFile file){
        if(!file.isEmpty()){
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(name)));
                stream.write(bytes);
                stream.close();
                return "You successful upload " + name +"!";
            }catch (Exception e){
                return "You failed to upload "+ name +" => " + e.getMessage();
            }
        }else {
            return "You failed to upload " + name + "because the file was empty";
        }
    }
}
