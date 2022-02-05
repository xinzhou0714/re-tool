package com.xinz.retool;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.xinz.retool.mapper")
public class ReToolApplication {
    private static final Logger LOG = LoggerFactory.getLogger(ReToolApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ReToolApplication.class);
        Environment env =app.run(args).getEnvironment();
        LOG.info("Backend started successfully！！");
        LOG.info("Address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));

    }

}
