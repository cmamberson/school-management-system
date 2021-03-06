package com.libertymutual.goforcode.schoolmanagementsystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.schoolmanagementsystem.models.Assignment;
import com.libertymutual.goforcode.schoolmanagementsystem.models.Grade;
import com.libertymutual.goforcode.schoolmanagementsystem.models.Student;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

	List<Grade> findByStudent(Student student);
	List<Grade> findByAssignment(Assignment assignment);
}
