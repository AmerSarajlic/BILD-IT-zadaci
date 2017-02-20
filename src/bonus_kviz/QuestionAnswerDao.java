package bonus_kviz;

import java.util.ArrayList;

public interface QuestionAnswerDao {

	public ArrayList<QuestionAnswer> getAllQuestionAnswer();

	public QuestionAnswer getQuestionAnswer(int rollNo);

	public void addQuestionAnswer(QuestionAnswer questionAnswer);

	public void deleteQuestionAnswer(int rollNo);
}
