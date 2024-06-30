package org.pekka.fulljakartaee.student;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/students")
public class StudentController {

    @GET
    @Produces("application/json")
    public String getStudents() {
        return "[]";
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public String getStudent(@PathParam("id") Long id) {
        return "{}"+ id;
    }
}
