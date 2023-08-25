package com.company.summativeproject1.controllers;


import com.company.summativeproject1.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DefinitionController {

    private List<Definition> wordList;
    private static int idCounter = 1;

    public DefinitionController() {
        wordList = new ArrayList<>();
        wordList.add(new Definition(idCounter++, "copacetic", "very satisfactory; fine"));
        wordList.add(new Definition(idCounter++, "lithology", "study of rocks"));
        wordList.add(new Definition(idCounter++, "tarriance", "act of tarrying or delaying; procrastination"));
        wordList.add(new Definition(idCounter++, "naufrageous", "in a state of danger or ruin; threatened"));
        wordList.add(new Definition(idCounter++, "lubricity", "greasiness; wiliness"));
        wordList.add(new Definition(idCounter++, "rinkomania", "obsession with skating"));
        wordList.add(new Definition(idCounter++, "yerk", "to draw tight; to bind"));
        wordList.add(new Definition(idCounter++, "helminthiasis", "infestation with worms"));
        wordList.add(new Definition(idCounter++, "halophilous", "tolerant of salt or salt-water"));
        wordList.add(new Definition(idCounter++, "ginglymus", "joint that permits movement in one plane only"));
        wordList.add(new Definition(idCounter++, "fabiform", "shaped like a bean"));
        wordList.add(new Definition(idCounter++, "nary", "not a one; not at all"));
        wordList.add(new Definition(idCounter++, "ophthalmoscope", "instrument for viewing the interior of the eye"));
        wordList.add(new Definition(idCounter++, "quaternity", "fourness; any group of four things"));
        wordList.add(new Definition(idCounter++, "ephebiatrics", "branch of medicine dealing with adolescence"));
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getRandomWord() {
        Random rand = new Random();
        int index = rand.nextInt(wordList.size());
        return wordList.get(index);
    }

}
