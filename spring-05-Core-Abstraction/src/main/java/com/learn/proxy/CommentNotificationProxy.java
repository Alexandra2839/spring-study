package com.learn.proxy;

import com.learn.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
