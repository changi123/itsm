package hong.itsm.itsm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hong.itsm.itsm.dto.QuizContentDto;
import hong.itsm.itsm.dto.QuizDto;
import hong.itsm.itsm.service.QuizService;


@Controller
@RequestMapping("/quiz")
public class QuizController {
		
	
	@Autowired
	private  QuizService quizService;
	
	// 제일 첫번째 문제만 먼저
	@GetMapping("/first")
	public String quizFirst(Model model) {
		QuizDto quizDto =  quizService.firstQuiz();
		List<QuizContentDto> quizContentDto =  quizService.quizContent(quizDto.getQuizId());
		model.addAttribute("quizDto",quizDto);
		model.addAttribute("quizContentDto",quizContentDto);
		
		return "quiz";
	}
	
	
	@GetMapping("/quizAdd")
	public String quizAddPage() {
		return "quizAdd";
	}
	
	@PostMapping("/quizAdd")
	public String quizAdd(QuizDto quizDto) {
		quizService.insertQuiz(quizDto);
		return "quizAdd";
	}
	
	
	
}
