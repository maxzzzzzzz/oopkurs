package maxoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * Created by ilost on 22.05.2017.
 */
@Controller
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }


}
