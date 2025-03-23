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
public class QuizContentDto {
    private int quizContentId;  // 퀴즈 항목 ID (Primary Key)
    private int quizId;         // 퀴즈 ID (QuizDto에서 참조할 ID)
    private String quizContent;  // 보기 내용
}
