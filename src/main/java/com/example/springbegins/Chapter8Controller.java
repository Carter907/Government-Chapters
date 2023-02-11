package com.example.springbegins;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import static com.example.springbegins.model.MQC1Model.isCorrect;

@Controller
public class Chapter8Controller {
    @GetMapping("/chap_8")
    String page(@RequestParam Map<String, String> params, Model model) {

        String answer;
        String question;



        for (int i = 1; (answer = params.get("answer_"+i)) != null; i++) {
            question = params.get("question_"+i);
            model.addAttribute("answerPicked_"+i, answer);
            model.addAttribute("isCorrect_"+i, isCorrect(question, answer));
        }
        Map<String, Object> modelMap = model.asMap();
        for (int i = 1; modelMap.getOrDefault("isCorrect_"+i, null) == null && i < 2; i++){
            model.addAttribute("isCorrect_"+i, "");
        }



        return "chapter8";
    }


}
