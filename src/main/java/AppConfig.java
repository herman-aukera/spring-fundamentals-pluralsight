import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan("com.pluralsight.")
public class AppConfig {


    @Bean("cal")
    public CalendarFactory calendarFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calendarFactory().getObject();
    }


//    @Bean(name = "speakerService")
//    @Scope( BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
////        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
//          SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
////        speakerService.setRepository();
//
//        return speakerService;
//    }
//
//    @Bean("speakerRepository")
//    public SpeakerRepository getSpeakerRepository() {
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
