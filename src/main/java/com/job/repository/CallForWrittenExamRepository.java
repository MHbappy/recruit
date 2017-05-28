package com.job.repository;

import com.job.model.CallForWrittenExam;
import com.job.model.CreatePost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallForWrittenExamRepository  extends CrudRepository<CallForWrittenExam, Integer> {

}
