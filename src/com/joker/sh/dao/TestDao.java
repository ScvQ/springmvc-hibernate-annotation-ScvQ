package com.joker.sh.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.joker.sh.model.entity.User;

@Repository("testDao")
public class TestDao {

    @Resource
    private HibernateTemplate hibernateTemplate;

    public void add(User user) {

        this.hibernateTemplate.save(user);

    }

    public void delete(String userId) {

        User user = new User();
        user.setId(userId);

        this.hibernateTemplate.delete(user);

    }

    public void deleteByHql(String userId) {

        String hql = " DELETE FROM User u WHERE u.id = ? ";

        this.hibernateTemplate.bulkUpdate(hql, userId);

    }

    public void update(User user) {
        this.hibernateTemplate.update(user);
    }

    public void saveOrUpdate(User user) {
        this.hibernateTemplate.saveOrUpdate(user);
    }

    public void updateByHql(String userId, String username) {

        String hql = " UPDATE User u SET u.name = ? WHERE u.id = ? ";

        this.hibernateTemplate.bulkUpdate(hql, new Object[] { username, userId });
    }

    public User findById(String userId) {
        return this.hibernateTemplate.get(User.class, userId);
        // this.hibernateTemplate.load(User.class, userId);
    }

    public User findByHql(String userId) {

        String hql = " FROM User u WHERE u.id = ? ";

        List<User> list = this.hibernateTemplate.find(hql, userId);

        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;

    }

    public List<User> queryUserListBySex(int sex) {

        String hql = " FROM User u WHERE u.sex = ? ";

        return this.hibernateTemplate.find(hql, sex);
    }

}
