package hong.itsm.itsm.service;

import java.awt.desktop.QuitEvent;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hong.itsm.itsm.dto.QuizContentDto;
import hong.itsm.itsm.dto.QuizDto;
import hong.itsm.itsm.mapper.QuizMapper;

@Service
public class QuizService {

	@Autowired
	private QuizMapper quizMapper;

	// 퀴즈 저장 메소드
	@Transactional
	public int insertQuiz(QuizDto quizDto) {
		// 퀴즈 삽입
		int result = quizMapper.insertQuiz(quizDto);

		// 퀴즈 아이디가 생성되면, 옵션을 삽입
		if (result > 0 && quizDto.getOptions() != null) {
			int setQuizId = quizMapper.lastQuizId();
			// QuizContent 배열을 순회하면서 옵션을 삽입
			for (String quizContent : quizDto.getOptions()) {
				QuizContentDto  quizContentDto = new QuizContentDto();
				quizContentDto.setQuizId(setQuizId);
				quizContentDto.setQuizContent(quizContent);
                quizMapper.insertQuizOptions(quizContentDto);
			}
		}

		return result;
	}

	public QuizDto firstQuiz() {
		return quizMapper.firstQuiz();
	}

	public List<QuizContentDto> quizContent(int quizId) {
		return quizMapper.quizContent(quizId);
	}

}
