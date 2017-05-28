package com.job.service;

import com.job.model.SendAppointment;
import com.job.repository.SendAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bappy on 5/21/17.
 */
@Service
public class SendAppointmentImpl implements SendAppointmentService{


    SendAppointmentRepository sendAppointmentRepository;

    @Autowired
    public void setSendAppointmentRepository(SendAppointmentRepository sendAppointmentRepository) {
        this.sendAppointmentRepository = sendAppointmentRepository;
    }

    @Override
    public Iterable<SendAppointment> listAllSendAppointment() {
        return sendAppointmentRepository.findAll();
    }

    @Override
    public SendAppointment getSendAppointmentById(Integer id) {
        SendAppointment sendAppointment = sendAppointmentRepository.findOne(id);
        return sendAppointment;
    }

    @Override
    public SendAppointment saveSendAppointment(SendAppointment sendAppointment) {
        return sendAppointmentRepository.save(sendAppointment);
    }


    @Override
    public void deleteSendAppointment(Integer id) {
        sendAppointmentRepository.delete(id);
    }
}
