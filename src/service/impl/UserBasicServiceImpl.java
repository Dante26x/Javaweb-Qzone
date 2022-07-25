package service.impl;

import dao.UserBasicDAO;
import pojo.UserBasic;
import service.UserBasicService;

import java.util.List;

public class UserBasicServiceImpl implements UserBasicService {
    private UserBasicDAO userBasicDAO = null;
    @Override
    public UserBasic login(String loginId, String pwd) {
        UserBasic userBasic = userBasicDAO.getUserBasic(loginId, pwd);
        return userBasic;
    }

    @Override
    public List<UserBasic> getFriendList(UserBasic userBasic) {
        List<UserBasic> userBasicList = userBasicDAO.getUserBasicList(userBasic);
        for(int i = 0;i<userBasicList.size();i++){
            UserBasic friend = userBasicDAO.getUserBasicById(userBasicList.get(i).getId());
            userBasicList.set(i,friend);
        }
        return userBasicList;
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        UserBasic userBasic = userBasicDAO.getUserBasicById(id);
        return userBasic;
    }
}
