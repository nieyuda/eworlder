
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: eworlder
 * @description: 常用工具类模块
 * @author: Mr.Yooda
 * @create: 2018-03-30 09:24
 **/
@ComponentScan("controller")
@SpringBootApplication
@EnableEurekaClient
public class CommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class,args);
    }
}
