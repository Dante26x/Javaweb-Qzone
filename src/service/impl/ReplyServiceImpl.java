package service.impl;

import dao.ReplyDAO;
import dao.TopicDAO;
import dao.UserBasicDAO;
import pojo.HostReply;
import pojo.Reply;
import pojo.Topic;
import pojo.UserBasic;
import service.HostReplyService;
import service.ReplyService;

import java.util.List;

public class ReplyServiceImpl implements ReplyService {
    private TopicDAO topicDAO;
    private ReplyDAO replyDAO;
    private HostReplyService hostReplyService;
    private UserBasicDAO userBasicDAO;
    @Override
    public List<Reply> getReplyListByTopicId(Integer topicId) {
        Topic topic = topicDAO.getTopic(topicId);
        List<Reply> replyList = replyDAO.getReplyList(topic);
        for (int i = 0; i < replyList.size() ; i++) {
            Reply reply = replyList.get(i);
            UserBasic user = userBasicDAO.getUserBasicById(reply.getAuthor().getId());
            HostReply hostReply = hostReplyService.getHostReplyByReplyId(reply.getId());
            reply.setAuthor(user);
            reply.setHostReply(hostReply);
            replyList.set(i,reply);
        }
        return replyList;
    }
}
