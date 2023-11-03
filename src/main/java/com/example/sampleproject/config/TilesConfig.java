package com.example.sampleproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

/**
 * @author Yun Yeji
 * @fileName : TilesConfig
 * @description
 * @since : 2023-10-31
 */
@Configuration
public class TilesConfig {

    @Bean
    public UrlBasedViewResolver viewResolver() {
        UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
        tilesViewResolver.setViewClass(TilesView.class);
        tilesViewResolver.setOrder(0);
        return tilesViewResolver;
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer configurer = new TilesConfigurer();

        configurer.setDefinitions(new String[] { "/WEB-INF/views/tiles.xml" });
        configurer.setCheckRefresh(true);
        return configurer;
    }
}