package org.microservicecloud.userservice.service;


import org.microservicecloud.userservice.domain.User;

import java.util.List;

/**
 * Created by wyc on 2019/12/12.
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
