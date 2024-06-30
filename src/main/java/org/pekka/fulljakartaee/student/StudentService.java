package org.pekka.fulljakartaee.student;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class StudentService {

    @Inject
    private StudentRepository studentRepository;

    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id)
                                .orElse(null);
    }
}
