import Frames.AppConfig;
import Frames.Samo_OKNO.ASD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(Frames.AppConfig.class);


        ASD windowService = context.getBean(ASD.class);
        windowService.open();

}
    }
