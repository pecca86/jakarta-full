package org.pekka.fulljakartaee;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.pekka.fulljakartaee.student.Student;
import org.pekka.fulljakartaee.student.StudentRepository;

@ApplicationPath("/api")
public class HelloApplication extends Application {

}
