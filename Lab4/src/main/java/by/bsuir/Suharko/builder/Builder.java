package by.bsuir.Suharko.builder;

import by.bsuir.Suharko.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
