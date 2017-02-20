package bonus_kviz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class QuestionAnswerDaoFileImpl implements QuestionAnswerDao {
	Path path = Paths.get("questions.txt");
	
	QuestionAnswer questionAnswer = new QuestionAnswer();

	public QuestionAnswerDaoFileImpl() {

	}

	@Override
	public QuestionAnswer getQuestionAnswer(int rollNo) {

		try (BufferedReader read = Files.newBufferedReader(path)) {
			String line = "";
			while ((line = read.readLine()) != null) {
				String[] array = line.split("/");
				if (rollNo == Integer.parseInt(array[0])) {
					questionAnswer.setQuestion(array[1]);
					questionAnswer.setAnswer(array[1].replaceAll(" ", ""));

				}
			}
		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
		}
		return questionAnswer;
	}

	@Override
	public void addQuestionAnswer(QuestionAnswer questionAnswer) {

		try (BufferedWriter write = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
			write.write(
					questionAnswer.getQuestion() + "/" + questionAnswer.getAnswer());
			write.newLine();
			System.out.println("Question added !\n");
		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
		}

	}

	@Override
	public void deleteQuestionAnswer(int rollNo) {
		ArrayList<QuestionAnswer> list = getAllQuestionAnswer();

		list.remove(rollNo);
		

			try (BufferedWriter write = Files.newBufferedWriter(path)) {

				for (QuestionAnswer qA : list) {
					String quesAns = qA.getQuestion() + "/" + qA.getAnswer();
					write.write(quesAns);
					write.newLine();
				}
				System.out.println("Question deleted !\n");

			} catch (Exception e) {
				System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);

		}
	}

	@Override
	public ArrayList<QuestionAnswer> getAllQuestionAnswer() {

		ArrayList<QuestionAnswer> list = new ArrayList<>();

		try (BufferedReader read = Files.newBufferedReader(path)) {
			String line = "";
			while ((line = read.readLine()) != null) {
				String[] array = line.split("/");

				list.add(new QuestionAnswer(array[0], array[1].replaceAll(" ", "")));
			}
		} catch (Exception e) {
			System.out.println(KvizUI.GENERIC_EXCEPTION_MESSAGE);
		}

		return list;
	}

}
