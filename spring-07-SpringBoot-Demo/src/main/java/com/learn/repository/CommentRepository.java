package com.learn.repository;

import com.learn.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
