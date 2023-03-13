package com.learn;

import com.learn.model.Comment;
import com.learn.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {

		Comment comment  = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework");

		ApplicationContext container = SpringApplication.run(MyApplication.class, args);

		CommentService commentService = container.getBean(CommentService.class);
		commentService.publishComment(comment);

		commentService.printConfigData();
		commentService.printDbConfigData();
	}



}
