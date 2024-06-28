package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import com.example.demo.model.Question;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
	private static List<Question> questions = List.of(
		new Question("Which flies a green, white, and orange (in that order) tricolor flag", new String[]{"Ireland", "Ivory Coast", "Italy"}, "Ireland"),
		new Question("What is the capital of France?", new String[]{"Berlin", "Paris", "Rome"}, "Paris"),
		new Question("What company makes the Xperia model of smartphone?", new String[]{"Samsung", "Sony", "Nokia"}, "Sony"),
		new Question("Which city is home to the Brandenburg Gate?", new String[]{"Vienna", "Zurich", "Berlin"}, "Berlin"),
		new Question("What is the square root of 16?", new String[]{"2", "3", "4"}, "4")
	);

	public static List<Question> getQuestions() {
		List<Question> shuffledQuestions = new ArrayList<>(questions);
		Collections.shuffle(shuffledQuestions);
		return shuffledQuestions;
	}
}
