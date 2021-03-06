package model.dao;

import model.User;
import service.EM;

import java.util.List;

public class UsersDAO implements ListDAO<User>{

    @Override
    public List<User> findAll() {
        return EM.getInstance().createNamedQuery("User.findAll",User.class).getResultList();

    }

    @Override
    public User findById(long id) {
        try {
            return EM.getInstance().createNamedQuery("User.findById", User.class)
                    .setParameter("id", id)
                    .getSingleResult();
        }catch (Exception e){
            return null;
        }
    }

}
