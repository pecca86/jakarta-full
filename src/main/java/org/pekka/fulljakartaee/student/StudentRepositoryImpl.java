package org.pekka.fulljakartaee.student;

import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Optional;

@Singleton
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Student> findStudentById(Long id) {
        return Optional.of(entityManager.find(Student.class, id));
    }
}
