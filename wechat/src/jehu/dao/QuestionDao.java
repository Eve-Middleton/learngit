package jehu.dao;

import java.util.List;

import  jehu.domain.Question;

public interface QuestionDao {
	public List<Question> getSelect(String subject);
}
