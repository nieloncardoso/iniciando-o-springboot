package com.aulasspring.aulasspring.config;

import com.aulasspring.aulasspring.entities.User;
import com.aulasspring.aulasspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run (String...args)throws Exception{


        User u1 = new User("maria@gmail.com",null,"Maria Brow","123456","988888888");
        User u2 = new User("alex@gmail.com",null,"Alex Green","123456","977777777");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }


}
