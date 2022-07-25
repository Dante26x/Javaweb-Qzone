package controller;

import dao.ReplyDAO;
import pojo.Reply;
import pojo.Topic;
import pojo.UserBasic;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

public class ReplyController {
    private ReplyDAO replyDAO;
    public String addReply(String content, Integer topicId,HttpSession session){
        Reply reply = new Reply(content, LocalDateTime.now(),(UserBasic)session.getAttribute("userBasic"),new Topic(topicId));
        replyDAO.addReply(reply);
        return "redirect:/topic.do?operate=topicDetail&id="+topicId;
    }
}
