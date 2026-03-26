package com.vish.pms.service;

import java.util.List;

public interface CrudService<T, ID> {

    T create(T entity);

    T update(ID id, T entity);

    T getByID(ID id);

    List<T> getAll(int page, int size, String sortBy, String direction);

    void deleteById(ID id);
}
