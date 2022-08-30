package com.szalai.jersey.config;

import com.szalai.jersey.resource.PersonResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        register(PersonResource.class);
    }
}
