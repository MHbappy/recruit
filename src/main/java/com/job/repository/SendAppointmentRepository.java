package com.job.repository;

import com.job.model.SendAppointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bappy on 5/21/17.
 */
@Repository
public interface SendAppointmentRepository  extends CrudRepository<SendAppointment, Integer> {
}
