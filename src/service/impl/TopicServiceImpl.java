package service.impl;

import dao.TopicDAO;
import dao.UserBasicDAO;
import pojo.Reply;
import pojo.Topic;
import pojo.UserBasic;
import service.ReplyService;
import service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO;
    private ReplyService replyService;
    private UserBasicDAO userBasicDAO;
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        List<Topic> topicList = topicDAO.getTopicList(userBasic);
        return topicList;
    }

    @Override
    public Topic getTopicById(Integer id) {
        Topic topic = topicDAO.getTopic(id);
        UserBasic user = userBasicDAO.getUserBasicById(topic.getAuthor().getId());
        List<Reply> replyList = replyService.getReplyListByTopicId(id);
        topic.setAuthor(user);
        topic.setReplyList(replyList);
        return topic;
    }
}
