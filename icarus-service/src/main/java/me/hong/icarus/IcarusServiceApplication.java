package me.hong.icarus;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.MultipartConfigElement;

/**
 * @Author : YiHong
 * @Description: icarus-service启动入口
 * @Date: Created in 17:30  2018/8/14.
 * @Modified By:
 */
@SpringBootApplication
@EnableSwagger2
public class IcarusServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcarusServiceApplication.class, args);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("1000MB");
        factory.setMaxRequestSize("1000MB");
        return factory.createMultipartConfig();
    }
}
