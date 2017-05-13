package com.job.repository;


import com.job.model.EducationInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("educationInformationRepository")
public interface EducationInformationRepository extends JpaRepository<EducationInformation,Integer>{
    EducationInformation findById(Integer id);
}
