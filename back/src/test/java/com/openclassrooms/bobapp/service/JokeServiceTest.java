package com.openclassrooms.bobapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.openclassrooms.bobapp.data.JsonReader;

@ExtendWith(MockitoExtension.class)
public class JokeServiceTest {

    @Mock
    private JsonReader jsonReader;

    @InjectMocks
    private JokeService jokeService;

    @Test
    public void testGetJokesCount() {
        when(jsonReader.getJokes()).thenReturn(Collections.emptyList());
        assertEquals(0, jokeService.getJokesCount());
    }
}
