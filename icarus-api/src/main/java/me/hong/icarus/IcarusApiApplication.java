package me.hong.icarus;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * @Author : YiHong
 * @Description: icarus-api启动入口
 * @Date: Created in 17:30  2018/8/14.
 * @Modified By:
 */
@SpringBootApplication
public class IcarusApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(IcarusApiApplication.class, args);

    }

    /**
     * 设置上传文件大小
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("1000MB");
        factory.setMaxRequestSize("1000MB");
        return factory.createMultipartConfig();
    }
}
