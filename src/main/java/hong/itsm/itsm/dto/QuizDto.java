package hong.itsm.itsm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {
    private int quizId;         // 퀴즈 아이디 (Primary Key)
    private String quizTitle;   // 퀴즈 제목
    private int quizCheck;      // 퀴즈 정답
    private String[] options;   // 보기 (배열 형태로 받음)
}
