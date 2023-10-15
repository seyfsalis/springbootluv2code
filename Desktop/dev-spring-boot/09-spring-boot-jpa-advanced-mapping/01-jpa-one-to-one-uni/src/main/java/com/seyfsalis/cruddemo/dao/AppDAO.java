package com.seyfsalis.cruddemo.dao;

import com.seyfsalis.cruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteIntructorById(int theId);

}
