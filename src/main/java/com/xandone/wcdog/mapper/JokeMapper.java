package com.xandone.wcdog.mapper;


import com.xandone.wcdog.pojo.CommentBean;
import com.xandone.wcdog.pojo.JokeBean;
import com.xandone.wcdog.pojo.JokeLikeBean;

import java.util.List;
import java.util.Map;

public interface JokeMapper {
	List<JokeBean> getJokeList();

	void addJoke(JokeBean jokeBean);

	JokeBean selectJokeBeanById(String jokeId);

	void thumbsJoke(JokeLikeBean jokeLikeBean);

	List<JokeLikeBean> selectJokeLikeById(String jokeId);

	void addComment(CommentBean commentBean);

	List<CommentBean> getJokeCommentById(String jokeId);

	void changeJokeLikeCount(Map<String, Object> map);

	void deleteJokeById(String id);

	void deleteJokeCommentById(String id);

}