package com.example.springbegins.model;

import java.util.HashMap;
import java.util.Map;

public class MQC1Model {

    public static final HashMap<String, String> questionAnswerPairs;

    static {
        questionAnswerPairs = new HashMap<>(Map.of(
                "What case involved the 2nd Amendment?","McDonald v. Chicago",
                "Which of the following best describes why the Supreme Court" +
                        " is so frequently asked to decide cases that involve civil liberties?",
                        "The need of the government to protect society is often in conflict with the rights of individuals."
        ));
    }

    public static String isCorrect(String question, String chosen) {
        if (questionAnswerPairs.get(question).equals(chosen))
            return "Correct Answer! " + chosen;

        return "Incorrect Answer, try again";
    }
}
