package com.seyfsalis.cruddemo.dao;

import com.seyfsalis.cruddemo.entity.Instructor;
import com.seyfsalis.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteIntructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
