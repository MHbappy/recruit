package com.job.repository;

import com.job.model.CallForViva;
import com.job.model.CallForWrittenExam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bappy on 5/21/17.
 */
@Repository
public interface CallForVivaRepository extends CrudRepository<CallForViva, Integer> {
}
