package org.pekka.fulljakartaee.student;

import java.util.Optional;

public interface StudentRepository {

    Optional<Student> findStudentById(Long id);
}
