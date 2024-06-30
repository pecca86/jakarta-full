package org.pekka.fulljakartaee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.pekka.fulljakartaee.student.Student;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Jakarta EE!");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            Student student = new Student();
            student.setFirstName("John");
            student.setLastName("Doe");
            student.setStudentId(123L);

            entityManager.persist(student);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
