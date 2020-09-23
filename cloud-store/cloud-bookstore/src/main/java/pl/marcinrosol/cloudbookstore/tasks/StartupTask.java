package pl.marcinrosol.cloudbookstore.tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import pl.marcinrosol.cloudbookstore.rest.models.Author;
import pl.marcinrosol.cloudbookstore.rest.services.AuthorService;
import pl.marcinrosol.cloudbookstore.rest.services.BookService;

import java.awt.*;
import java.util.Collections;

@Configuration
@EnableScheduling
@Slf4j
@AllArgsConstructor
public class StartupTask {

    private final BookService bookService;
    private final AuthorService authorService;


    @EventListener(ApplicationReadyEvent.class)
    private void afterStartup(){
        try{
            Author author = new Author();
            author.setName("Adam");
            author.setSurname("przybysz");
            author.setBooks(Collections.emptyList());
            log.info(author.toString());
            authorService.addAuthor(author);
        }catch (Exception e){
        log.error(e.getMessage());
        }

        log.info("tudum tudm");
    }

}
