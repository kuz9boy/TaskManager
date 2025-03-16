package Frames;

import Frames.Samo_OKNO.Main_Frame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Frames")
public class AppConfig {

    @Bean
    public Main_Frame windowCreator(){
        return new Main_Frame();
    }

}
