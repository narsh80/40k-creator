package fr.btjt.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

/**
 * Created by melghali on 04/01/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(SWAGGER_2)
                .enable(true);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer swaggerProperties() {
        PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
        return properties;
    }

}
