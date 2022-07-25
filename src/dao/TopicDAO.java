package dao;

import pojo.Topic;
import pojo.UserBasic;

import java.util.List;

public interface TopicDAO {
    public List<Topic> getTopicList(UserBasic userBasic);
    public void addTopic(Topic topic);
    void delTopic(Topic topic);
    Topic getTopic(Integer id);
}
