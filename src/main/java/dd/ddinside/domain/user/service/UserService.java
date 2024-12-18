package dd.ddinside.domain.user.service;

import dd.ddinside.domain.user.User;
import dd.ddinside.domain.user.dao.UserDao;
import dd.ddinside.domain.user.dto.UserSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public User save(UserSaveDto userDto)
    {
        Long id = userDao.save(userDto);
        return findById(id);
    }

    public User findById(Long id)
    {
        return userDao.findById(id);
    }
}
