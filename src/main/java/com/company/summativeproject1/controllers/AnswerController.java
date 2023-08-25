package com.company.summativeproject1.controllers;

import com.company.summativeproject1.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class AnswerController {

    public static List<String> answers = Arrays.asList(
            "Yes", "No", "Maybe", "Try Again", "Most Likely",
            "Without a doubt", "My sources say otherwise",
            "Don't Count on it", "Cannot predict now", "Very doubtful"
    );
    private static int idCounter = 1;

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer askQuestion(@RequestBody Answer question){
        int min = 0;
        int max = answers.size();
        question.setId(idCounter++);
        int random = (int) (Math.random() * (max - min)) + min;
        if(question.getQuestion() == null){
            question.setQuestion("");
        }
        question.setAnswer(answers.get(random));
        return question;
    }
}
