package br.com.jonatas.menezes.cartola.liga.duelo.titas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LigaDueloTitasApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LigaDueloTitasApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LigaDueloTitasApplication.class);
    }
}
