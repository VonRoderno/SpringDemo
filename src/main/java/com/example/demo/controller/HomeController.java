package com.example.demo.controller;

import com.example.demo.model.QuizTaker;
import com.example.demo.model.UserSession;
import com.example.demo.model.DataMap;
import com.example.demo.model.Question;
import com.example.demo.service.QuizService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("questions")
public class HomeController {

    @Autowired
    private UserSession userSession;
    @Autowired
    private QuizTaker quizTaker;

    @GetMapping("/")
    public String home(Model model) {
        if(userSession.getUsername()==null) return "redirect:/login";
        model.addAttribute("message", "Hello, Springs Boot with JSP!");
        model.addAttribute("userSession", userSession);
        return "home";
    }
    @PostMapping("/")
    public String takenhome(Model model) {
        if(userSession.getUsername()==null) return "redirect:/login";
        model.addAttribute("message", "Hello, Springs Boot with JSP!");
        model.addAttribute("userSession", userSession);
        return "home";
    }
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password) {
        Map<String, String> userMap = DataMap.createMap();
        if (userMap.containsKey(username) && userMap.get(username).equals(password)) {
            userSession.setUsername(username);
            return "redirect:/";
        } else {
            return "redirect:/login?error=invalid username or password";
        }
    }

    @GetMapping("/exam")
    public String exam(Model model, HttpServletRequest request) {
        if(userSession.getUsername()==null) return "redirect:/login";
        List<Question> questions = QuizService.getQuestions();
        request.getSession().setAttribute("questions", questions);
        model.addAttribute("questions", questions);
        return "exam";
    }

    @GetMapping("/grades")
    public String grades(Model model) {
        if(userSession.getUsername()==null) return "redirect:/login";
        model.addAttribute("grades", quizTaker.getGrades());
        return "grades";
    }
    @GetMapping("/result")
    public String resultUnposted() {
        if(userSession.getUsername()==null) return "redirect:/login";
        return "result";
    }
    @PostMapping("/result")
    public String result(@RequestParam String stud_name, HttpServletRequest request, Model model) {
        if(userSession.getUsername()==null) return "redirect:/login";
        userSession.setCheck_taken("true");
        List<Question> questions = (List<Question>) request.getSession().getAttribute("questions");
        double score = 0;
        for (int i = 0; i < questions.size(); i++) {
            String questionName = "question" + (i + 1); // Construct the parameter name dynamically
            String selectedAnswer = request.getParameter(questionName);
            if (questions.get(i).getCorrectAnswer().equals(selectedAnswer)) {
                score++;
            }
        }
        double finalScore = ((score)/5)*100;
        System.out.println(finalScore);
        quizTaker.setGrades(stud_name, finalScore);
        model.addAttribute("score", (int)score);
        model.addAttribute("finalScore", finalScore);
        return "result";
    }
    @GetMapping("/logout")
    public String logout() {
        userSession.setUsername(null);
        return "redirect:/login";
    }
}
