package com.company.summativeproject1.controllers;

import com.company.summativeproject1.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuoteController {
    private static int idCounter = 1;
    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(idCounter++, "Ernest Hemingway", "There is nothing noble in being" +
                    "superior to your fellow man. True nobility is being superior to your" +
                    "former self"),
            new Quote(idCounter++, "William Shakespeare", "And as imagination bodies forth. The forms of things unknown, " +
                    "the poet's pen. Turns them to shapes and gives to airy nothing." +
                    "A local habitation and a name."),
            new Quote(idCounter++, "Somerset Maugham", "If you can tell stories, create characters, devise incidents, " +
                    "and have sincerity and passion, it doesn't matter a damn how you write"),
            new Quote(idCounter++, "Mark Twain", "Most writers regard the truth as their most valuable possession, and " +
                    "therefore are most economical in its use"),
            new Quote(idCounter++, "Ernest Hemingway", "It's none of their business that you have to learn to write. " +
                    "Let them think you were born that way."),
            new Quote(idCounter++, "C. J. Cherryh", "It is perfectly okay to write garbage—as long as you edit brilliantly."),
            new Quote(idCounter++, "Robert Benchley", "It took me fifteen years to discover I had no talent for writing, " +
                    "but I couldn't give it up because by that time I was too famous."),
            new Quote(idCounter++, "Ray Bradbury", "Any man who keeps working is not a failure. He may not be a great writer, " +
                    "but if he applies the old-fashioned virtues of hard, constant labor, he'll eventually make some kind of " +
                    "career for himself as writer."),
            new Quote(idCounter++, "Sidney Sheldon", "A blank piece of paper is God's way of telling us how hard it to be God."),
            new Quote(idCounter++, "Henry David Thoreau", "Not that the story need be long, but it will take a long while to make it short"),
            new Quote(idCounter++, "Ray Bradbury", "First, find out what your hero wants, then just follow him!"),
            new Quote(idCounter++, "Willa Cather", "Most of the basic material a writer works with is acquired before the age of fifteen."),
            new Quote(idCounter++, "Reuben Agogoe", "YOLO")


    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote(){
        int min = 0;
        int max = quoteList.size();
        return quoteList.get((int) (Math.random() * (max - min)) + min);
    }

}
