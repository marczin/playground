package pl.marcinrosol.cloudbookstore.tasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import pl.marcinrosol.cloudbookstore.rest.services.AuthorService;
import pl.marcinrosol.cloudbookstore.rest.services.BookService;

@Configuration
@EnableScheduling
@Slf4j
public class StartupTask {

    private BookService bookService;
    private AuthorService authorService;

    @EventListener(ApplicationReadyEvent.class)
    private void afterStartup(){
        log.info("tudum tudm");
    }

}
