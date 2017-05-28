package com.job.service;

import com.job.model.SendAppointment;


public interface SendAppointmentService {

    Iterable<SendAppointment> listAllSendAppointment();

    SendAppointment getSendAppointmentById(Integer id);

    SendAppointment saveSendAppointment(SendAppointment sendAppointment);

    void deleteSendAppointment(Integer id);

}
