package dao.impl;

import dao.HostReplyDAO;
import myssm.basedao.BaseDAO;
import pojo.HostReply;

public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return load("select * from t_host_reply where reply = ?",replyId);
    }
}
