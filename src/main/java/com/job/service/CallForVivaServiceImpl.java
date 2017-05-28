package com.job.service;


import com.job.model.CallForViva;
import com.job.repository.CallForVivaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CallForVivaServiceImpl implements CallForVivaService{

    CallForVivaRepository callForVivaRepository;

    @Autowired
    public void setCallForVivaRepository(CallForVivaRepository callForVivaRepository) {
        this.callForVivaRepository = callForVivaRepository;
    }

    @Override
    public Iterable<CallForViva> listAllCallForViva() {
        return callForVivaRepository.findAll();
    }

    @Override
    public CallForViva getCallForVivaById(Integer id) {
        CallForViva callForViva = callForVivaRepository.findOne(id);
        return callForViva;
    }

    @Override
    public CallForViva saveCallForViva(CallForViva callForViva) {
        return callForVivaRepository.save(callForViva);
    }

    @Override
    public void deleteCallForViva(Integer id) {
        callForVivaRepository.delete(id);
    }
}
