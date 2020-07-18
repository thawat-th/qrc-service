package com.github.gdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@SpringBootApplication
@Controller
public class QrcServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QrcServiceApplication.class, args);
    }

    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
       return new BufferedImageHttpMessageConverter();
    }

    @GetMapping("/")
    public void root(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

}
