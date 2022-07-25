package service.impl;

import dao.HostReplyDAO;
import pojo.HostReply;
import service.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {
    private HostReplyDAO hostReplyDAO;
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        HostReply hostReply = hostReplyDAO.getHostReplyByReplyId(replyId);
        return hostReply;
    }
}
