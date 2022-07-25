package service;

import pojo.Topic;
import pojo.UserBasic;

import java.util.List;

public interface TopicService {
    List<Topic> getTopicList(UserBasic userBasic);
    Topic getTopicById(Integer id);
}
