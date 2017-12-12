package com.raptorplan.raptorplan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StaticMappingConfigurer extends WebMvcConfigurerAdapter implements WebMvcConfigurer {
    private static final String STATIC_FILE_PATH = "src/main/resources/static";

    public void addViewControllers(ViewControllerRegistry registry){
        try {
            Files.walk(Paths.get(STATIC_FILE_PATH), new FileVisitOption[0])
                    .filter(Files::isRegularFile)
                    .map(f -> f.toString())
                    .map(s -> s.substring(STATIC_FILE_PATH.length()))
                    .map(s -> s.replaceAll("\\.html", ""))
                    .forEach(p -> registry.addRedirectViewController(p, p + ".html"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // add the special case for "whatever.html" to "/" mapping
        registry.addRedirectViewController("/", "whatever.html");
    }

}
