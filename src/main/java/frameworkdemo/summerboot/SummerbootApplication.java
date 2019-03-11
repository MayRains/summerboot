package frameworkdemo.summerboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("frameworkdemo.summerboot.dao")
@SpringBootApplication()

public class SummerbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerbootApplication.class, args);
    }

}
