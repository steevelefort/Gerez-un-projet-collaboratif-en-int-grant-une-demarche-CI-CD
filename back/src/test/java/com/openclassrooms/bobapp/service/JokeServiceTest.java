package com.openclassrooms.bobapp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JokeServiceTest {

    @Autowired
    private JokeService jokeService;

    @Test
    void testGetJokesCount() {
        int count = jokeService.getJokesCount();
        assertTrue(count > 0, "Jokes count should be greater than 0");
    }

}
