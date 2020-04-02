package  jehu.service;

import java.util.List;

import  jehu.dao.impl.QuestionDAOImpl;
import  jehu.domain.Question;

public class QuestionService {
	public List<Question> getKey(String subject) {
		QuestionDAOImpl quelmpl = new QuestionDAOImpl();
		List<Question> qlist = quelmpl.getSelect(subject);
		return qlist;
	}
}
