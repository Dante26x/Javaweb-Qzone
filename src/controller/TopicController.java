package controller;

import pojo.Topic;
import service.ReplyService;
import service.TopicService;

import javax.servlet.http.HttpSession;

public class TopicController {
    private TopicService topicService;
    private ReplyService replyService;

    public String topicDetail(Integer id, HttpSession session){
        Topic topic = topicService.getTopicById(id);
        session.setAttribute("topic",topic);
        return "frames/detail";
    }
}
