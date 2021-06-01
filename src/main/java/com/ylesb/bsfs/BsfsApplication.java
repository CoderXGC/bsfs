package com.ylesb.bsfs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by cc_want on 2018/6/2.
 */
@Slf4j
@EnableSwagger2
@SpringBootApplication
public class BsfsApplication extends SpringBootServletInitializer implements CommandLineRunner{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //return super.configure(builder);
        return builder.sources(BsfsApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(BsfsApplication.class, args);
    }
    @Override
    public void run(String... strings) throws Exception {
        //System.out.println("服务启动完成!");
        log.info("服务启动完成!");
    }
}
