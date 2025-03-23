package hong.itsm.itsm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import hong.itsm.itsm.dto.QuizContentDto;
import hong.itsm.itsm.dto.QuizDto;

@Mapper
public interface QuizMapper {

	int insertQuiz(QuizDto quizDto);
	
	int lastQuizId();

	void insertQuizOptions(QuizContentDto quizContentDto);

	QuizDto firstQuiz();

	List<QuizContentDto> quizContent(int quizId);

	QuizDto nextQuizId(int quidId);

}

