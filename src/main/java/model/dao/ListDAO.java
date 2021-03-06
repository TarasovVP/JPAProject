package model.dao;

import java.util.List;

public interface ListDAO<T> {

    List<T> findAll();
    T findById(long id);

}
