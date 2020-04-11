import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = applicationContext.getBean("speakerService",SpeakerService.class);

        System.out.println(service);

    }

}
