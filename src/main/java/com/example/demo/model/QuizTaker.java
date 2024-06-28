package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;

@Component
@SessionScope
public class QuizTaker {
    private String name;
    private double score;
    private Map<String, Double> grades = new HashMap<String, Double>();

    public Map<String, Double> getGrades() {
        return grades;
    }
    public void setGrades(String name, double score) {
        Map<String, Double> grades = getGrades();
        grades.put(name, score);
        this.grades = grades;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public double getScore() {
        return score;
    }
}

