package com.szalai.jersey.resource;

import com.szalai.jersey.model.Person;
import com.szalai.jersey.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.util.List;

@Path("/person")
public class PersonResource {

    @Autowired
    PersonRepository personRepository;

    @GET
    @Path("")
    @Produces("application/json")
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @GET
    @Path("/{name}")
    @Produces("application/json")
    public Person getByName(@PathParam("name") String name){
        return personRepository.findByName(name);
    }

    @POST
    @Path("")
    @Consumes("application/json")
    @Produces("application/json")
    public Person save(Person person){
        return personRepository.save(person);
    }
}
