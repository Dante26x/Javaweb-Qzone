package service;

import pojo.Reply;

import java.util.List;

public interface ReplyService {
    List<Reply> getReplyListByTopicId(Integer topicId);
}
