package by.bsuir.Suharko.repository;

import by.bsuir.Suharko.exception.RepositoryException;
import by.bsuir.Suharko.specification.Specification;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Repository<T> {

    Optional<T> query(Specification specification) throws RepositoryException;

    List<T> queryAll(Specification specification) throws RepositoryException;

    void save(T item) throws RepositoryException;

    String getTableName();

    Map<String, Object> getFields(T item);
}
