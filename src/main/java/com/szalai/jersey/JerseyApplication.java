package com.szalai.jersey;

import com.szalai.jersey.model.Person;
import com.szalai.jersey.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class JerseyApplication {

    private final PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(JerseyApplication.class, args);
    }

    @PostConstruct
    public void initDatabase(){
        personRepository.saveAll(
                List.of(
                        new Person("adam@mail.com", 25, false),
                        new Person("brian@mail.com", 23, false),
                        new Person("cecil@mail.com", 22, true),
                        new Person("daniel@mail.com", 27, false),
                        new Person("elisabeth@mail.com", 24, true)
                )
        );
    }

}
