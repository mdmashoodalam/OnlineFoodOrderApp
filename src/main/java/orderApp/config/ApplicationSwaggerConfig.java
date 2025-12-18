package orderApp.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class ApplicationSwaggerConfig {

//    @Bean
//    public OpenAPI openApi() {
//        Server localhost = new Server()
//            .url("http://localhost:8080")
//            .description("Local Environment");
//        
//        Server production = new Server()
//            .url("https://api.foodapp.com")
//            .description("Production Environment");
//        
//       
//
//        Contact contact = new Contact()
//            .name("Md Mashood ALam")
//            .email("mashoodalam05@gmail.com");
//
//        Info info = new Info()
//            .title("Online Food Order Application")
//            .version("1.0")
//            .description("This documentation exposes API endpoints to manage food application")
//            .contact(contact);
//
//        return new OpenAPI()
//            .info(info)
//            .servers(List.of(localhost, production));
//    }
}