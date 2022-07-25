package dao;

import pojo.Reply;
import pojo.Topic;

import java.util.List;

public interface ReplyDAO {
    List<Reply> getReplyList(Topic topic);
    void addReply(Reply reply);
    void delReply(Reply reply);
    Reply getReply(Reply reply);
}
