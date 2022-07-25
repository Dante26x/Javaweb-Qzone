package dao.impl;

import dao.ReplyDAO;
import myssm.basedao.BaseDAO;
import pojo.Reply;
import pojo.Topic;

import java.util.List;

public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return super.executeQuery("select * from t_reply where topic = ?",topic.getId());
    }

    @Override
    public void addReply(Reply reply) {
        executeUpdate("insert into t_reply values(0,?,?,?,?)",reply.getContent(),reply.getReplyDate(),reply.getAuthor().getId(),reply.getTopic().getId());
    }

    @Override
    public void delReply(Reply reply) {
        executeUpdate("delete from t_reply where id = ?",reply.getId());
    }

    @Override
    public Reply getReply(Reply reply) {
        return null;
    }
}
