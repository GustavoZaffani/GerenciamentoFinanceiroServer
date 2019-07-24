package br.com.gerenciamentofinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class GerenciamentofinanceiroApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GerenciamentofinanceiroApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(GerenciamentofinanceiroApplication.class, args);

    }
}

