package com.example.employeebackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
    public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Transactional
    @Modifying
    @Query("update Employee e set e.firstName = :firstName where e.id = :empId")
    void updateEmployeeFirstNameById(@Param("empId") long empId, @Param("firstName") String firstName);
}
